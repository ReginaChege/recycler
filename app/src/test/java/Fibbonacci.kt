import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsassignment.R

class Fibbonacci (var nums: List<Int>):RecyclerView.Adapter<NumberViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
            var view =LayoutInflater.from(parent.context)
                .inflate(R.layout.fibbonaci_numbers,parent,false)
            return NumberViewHolder(view)
        }

        override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
            val number = nums[position]
            holder.tilnums.text = number.toString()
        }

        override fun getItemCount(): Int {
            return nums.size
        }
    }
    class NumberViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var tilnums = itemView.findViewById<TextView>(R.id.tilnums)
    }
