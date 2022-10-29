const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync(0, "utf8")
        : `2100000000 9 10`
).split("\n")

const numbers = stdin.toString().trim().split(' ').map(e => parseInt(e));

const fixedCost = numbers[0];
const variableCost = numbers[1];
const salesPrice = numbers[2]
let productionCnt = 0; // 생산 제품 갯수
let profit = salesPrice - variableCost;

if (profit <= 0) {
    productionCnt = -1;
} else {
    productionCnt = Math.floor(fixedCost / profit) + 1;
}

console.log(productionCnt);

