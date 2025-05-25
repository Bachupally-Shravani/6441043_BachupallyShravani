document.querySelector("form").addEventListener("submit", function (e) {
    e.preventDefault();
    console.log("Form submitted");
    const payload = {
        name: e.target.elements.name.value,
        email: e.target.elements.email.value
    };
    console.log("Payload:", payload);

    fetch("https://mock.api/register", {
        method: "POST",
        body: JSON.stringify(payload),
        headers: { "Content-Type": "application/json" }
    }).then(res => console.log("Response:", res));
});
