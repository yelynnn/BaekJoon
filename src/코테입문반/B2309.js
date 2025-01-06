function B2309() {
  const array = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n")
    .map(Number);

  const sum = array.reduce(
    (accumulator, currentValue) => accumulator + currentValue,
    0
  );

  const num = sum - 100;

  for (let i = 0; i < array.length; i++) {
    for (let j = i + 1; j < array.length; j++) {
      const total = array[i] + array[j];
      if (total === num) {
        const result = array.filter((_, index) => index !== i && index !== j);
        result.sort((a, b) => a - b);
        console.log(result.join("\n"));
        return;
      }
    }
  }
}

export default B2309;
