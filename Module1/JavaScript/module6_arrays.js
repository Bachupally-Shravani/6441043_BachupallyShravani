let eventList = [
    { name: "Baking Workshop", category: "Workshop" },
    { name: "Rock Concert", category: "Music" }
];

eventList.push({ name: "Jazz Night", category: "Music" });

const musicEvents = eventList.filter(e => e.category === "Music");

const displayCards = eventList.map(e => `Event: ${e.name}`);
console.log(displayCards);
