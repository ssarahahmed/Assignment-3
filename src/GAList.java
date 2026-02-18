public class GAList <N>{

        private N[] listofsongs;
        private int size;
        private int maxSize;

        public GAList(){
            maxSize = 10;
            size = 0;
            // create array
            listofsongs = (N[]) new Object[maxSize];
        }

        public void addy(N p) {
            // check if full, and make bigger before adding
            if (size == maxSize) {
                maxSize = maxSize * 2;
                N[] temp = (N[]) new Object[maxSize];
                //copy elements, from old array to new one
                for (int i = 0; i < size; i++) {
                    temp[i] = listofsongs[i];

                }
                listofsongs[size] = p;
                size++;
            }
        }

            public void removy(int pos){
            //shift elements after pos to the left one spot
                for(int i = pos; i < size -1; i++){
                    listofsongs[i] = listofsongs[i+1];
                }
                size--;
            }

            public String toString(){
                String result = "";

                for(int i = 0; i < size; i++){
                    // add newline for each song
                    result = result + listofsongs[i] + "\n";
                }
                return result;
            }
        }


