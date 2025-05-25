function addEvent(name, date, category, seats) {
    return { name, date, category, seats };
}

function registerUser(event) {
    if (event.seats > 0) {
        event.seats--;
        return true;
    }
    return false;
}

function filterEventsByCategory(events, category) {
    return events.filter(e => e.category === category);
}

// Closure to count category registrations
function categoryCounter(category) {
    let count = 0;
    return () => {
        count++;
        console.log(`Total registrations in ${category}: ${count}`);
    };
}

const musicCounter = categoryCounter("Music");
musicCounter();
musicCounter();
