const container = document.querySelector("#events");

const sampleEvent = { name: "Yoga Class", date: "2025-06-05", seats: 15 };

function renderEvent(event) {
    const card = document.createElement("div");
    card.textContent = `${event.name} - ${event.date}`;
    container.appendChild(card);
}

renderEvent(sampleEvent);
