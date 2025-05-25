const events = [
    { name: "Music Fest", date: "2025-06-15", seats: 10 },
    { name: "Tech Meetup", date: "2024-05-01", seats: 0 }
];

events.forEach(event => {
    const isUpcoming = new Date(event.date) > new Date();
    const hasSeats = event.seats > 0;

    if (isUpcoming && hasSeats) {
        console.log(`${event.name} is available`);
    } else {
        console.log(`${event.name} is unavailable`);
    }
});

function register(event) {
    try {
        if (event.seats <= 0) throw new Error("No seats available.");
        event.seats--;
        console.log(`Registered for ${event.name}`);
    } catch (e) {
        console.error(e.message);
    }
}

register(events[0]);
