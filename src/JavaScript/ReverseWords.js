
// Program to reverse Words.

 function reverseWords(sentence) {
  const words = sentence.split(' ');
  const reversedWords = words.map(word => reverseWord(word));
  return reversedWords.join(' ');
}

function reverseWord(word) {
  return word.split('').reverse().join('');
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
