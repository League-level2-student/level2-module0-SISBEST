int [] arr;
void setup() {
  size(300, 300);
  arr = new int [width];
  noStroke();
}

void draw() {
  background(0, 0, 255);
  fill(0, 255, 0);
  for(int i = 0; i<arr.length; i++){
   rect(arr[i], height, 1, -arr[i]); 
  }
  stepSort(arr);
  if(mousePressed){
    Randomize();
  }
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
void Randomize(){
  for(int i = 0; i<arr.length; i++){
   arr[i] = (int) random(height);
  }
}