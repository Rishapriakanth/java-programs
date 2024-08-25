import React, { useState } from 'react';
import axios from 'axios';

const App = () => {
    const [input, setInput] = useState('');
    const [response, setResponse] = useState(null);
    const [error, setError] = useState('');
    const [selectedOptions, setSelectedOptions] = useState([]);
    const [showDropdown, setShowDropdown] = useState(false);

    const handleInputChange = (e) => {
        setInput(e.target.value);
    };

    const validateJSON = (str) => {
        try {
            JSON.parse(str);
            return true;
        } catch (e) {
            return false;
        }
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        setError('');

        if (!validateJSON(input)) {
            setError('Invalid JSON format');
            return;
        }

        try {
            const jsonData = JSON.parse(input);
            const res = await axios.post('https://testbfhl.herokuapp.com/bfhl', jsonData);
            setResponse(res.data);
            setShowDropdown(true);
        } catch (error) {
            setError('Error calling the API');
        }
    };

    const handleDropdownChange = (e) => {
        const value = Array.from(e.target.selectedOptions, option => option.value);
        setSelectedOptions(value);
    };

    const renderResponse = () => {
        if (!response) return null;

        const dataToDisplay = {};
        if (selectedOptions.includes('Alphabets')) {
            dataToDisplay.alphabets = response.alphabets;
        }
        if (selectedOptions.includes('Numbers')) {
            dataToDisplay.numbers = response.numbers;
        }
        if (selectedOptions.includes('Highest lowercase alphabet')) {
            dataToDisplay.highest_lowercase_alphabet = response.highest_lowercase_alphabet;
        }

        return (
            <div>
                <h3>Response:</h3>
                <pre>{JSON.stringify(dataToDisplay, null, 2)}</pre>
            </div>
        );
    };

    return (
        <div style={{ padding: '20px' }}>
            <h1>17091999</h1> {/* Replace with your roll number */}
            <form onSubmit={handleSubmit}>
                <textarea
                    value={input}
                    onChange={handleInputChange}
                    placeholder='Enter JSON here...'
                    rows='4'
                    style={{ width: '100%', marginBottom: '10px' }}
                />
                <button type='submit'>Submit</button>
            </form>
            {error && <p style={{ color: 'red' }}>{error}</p>}
            {showDropdown && (
                <div>
                    <select multiple onChange={handleDropdownChange}>
                        <option value="Alphabets">Alphabets</option>
                        <option value="Numbers">Numbers</option>
                        <option value="Highest lowercase alphabet">Highest lowercase alphabet</option>
                    </select>
                </div>
            )}
            {renderResponse()}
        </div>
    );
};

export default App;
