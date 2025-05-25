document.querySelector("form").addEventListener("submit", function (e) {
    e.preventDefault();
    const { name, email, event } = e.target.elements;

    if (!name.value || !email.value) {
        alert("Please fill all fields.");
        return;
    }

    console.log(`Registering ${name.value} for ${event.value}`);
});
