const events = [{ name: "Concert", seats: 20 }];

function logEvent({ name, seats = 0 }) {
    console.log(`${name} has ${seats} seats`);
}

const filtered = [...events].filter(e => e.seats > 10);

logEvent(events[0]);
