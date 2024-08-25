const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const PORT = process.env.PORT || 3000;

app.use(bodyParser.json());

// POST endpoint
app.post('/bfhl', (req, res) => {
    const { full_name, dob, numbers, alphabets } = req.body;

    // Validate input
    if (!full_name || !dob || !Array.isArray(numbers) || !Array.isArray(alphabets)) {
        return res.status(400).json({ is_success: false, message: "Invalid input" });
    }

    // Generate user_id
    const user_id = `${full_name.toLowerCase().replace(/\s+/g, '_')}_${dob}`;

    // Find the highest lowercase alphabet
    const highestLowercase = alphabets.filter(char => char === char.toLowerCase());
    const highestChar = highestLowercase.length > 0 ? Math.max(...highestLowercase.map(c => c.charCodeAt(0))) : null;

    res.json({
        is_success: true,
        user_id: user_id,
        college_email_id: `${user_id}@college.edu`,
        college_roll_number: `${dob.replace(/-/g, '')}`,
        numbers: numbers,
        alphabets: alphabets,
        highest_lowercase_alphabet: highestChar ? String.fromCharCode(highestChar) : null
    });
});

// GET endpoint
app.get('/bfhl', (req, res) => {
    res.status(200).json({ operation_code: 1 });
});

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
