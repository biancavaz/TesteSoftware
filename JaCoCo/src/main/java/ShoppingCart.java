
    import org.example.Item;

    import java.util.ArrayList;

    public class ShoppingCart {

        private ArrayList<Item> item = new ArrayList<>();

        public void addItem (Item item) {
            this.item.add(item);
        }

        public int getItemCount (){
            return this.item.size();
        }

        public Double calculeTotal (){

            double soma =0;

            for (Item itens : this.item){
                soma += itens.getpreco();
            }
            return soma;
        }
    }

