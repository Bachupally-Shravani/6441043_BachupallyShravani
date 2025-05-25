function sendRegistration(user) {
    console.log("Sending registration...");
    fetch("https://mock.api/register", {
        method: "POST",
        body: JSON.stringify(user),
        headers: { "Content-Type": "application/json" }
    })
        .then(res => res.json())
        .then(data => {
            console.log("Success:", data);
        })
        .catch(err => console.error("Failed:", err));
}

setTimeout(() => {
    sendRegistration({ name: "Ali", email: "ali@example.com" });
}, 2000);
