//SOrt the array in descending order

const arr = [5, 2, 9, 1, 5, 6];
console.log("Original array: ", arr);
let sortedArray = []
for(let i=0; i<arr.length-1; i++){
	for(let j = i+1 ; j< arr.length;j++)
        {
            if(arr[i] <  arr[j])
            {
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
}


console.log("Sorted array: ", arr);
