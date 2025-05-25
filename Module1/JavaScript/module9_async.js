function fetchEvents() {
    return fetch("events.json")
        .then(res => res.json())
        .catch(err => console.error("Fetch failed", err));
}

async function loadEvents() {
    document.body.innerHTML += "<div id='spinner'>Loading...</div>";
    const events = await fetchEvents();
    document.querySelector("#spinner").remove();
    console.log(events);
}
loadEvents();
