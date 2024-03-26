const recognition = new webkitSpeechRecognition();
recognition.lang = 'en-US';

recognition.onresult = function(event) {
    const result = event.results[0][0].transcript;
    console.log('You said: ', result);

    // Use the spoken text to create a response
    const response = `You said: ${result}`;

    // Speak the response
    const utterance = new SpeechSynthesisUtterance(response);
    utterance.lang = 'en-US';
    speechSynthesis.speak(utterance);
};

recognition.start();
