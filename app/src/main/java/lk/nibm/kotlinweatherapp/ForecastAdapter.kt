package lk.nibm.kotlinweatherapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ForecastAdapter : RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder>() {
    data class ForecastItem(val date: String, val temperature: String, val description: String)

    private val forecastItems = mutableListOf<ForecastItem>()


    class ForecastViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
        val temperatureTextView: TextView = itemView.findViewById(R.id.temperatureTextView)
        val weatherDescriptionTextView: TextView = itemView.findViewById(R.id.weatherDescriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_forecast, parent, false)
        return ForecastViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        val item = forecastItems[position]
        holder.dateTextView.text = item.date
        holder.temperatureTextView.text = item.temperature
        holder.weatherDescriptionTextView.text = item.description
    }


    override fun getItemCount(): Int {
        return forecastItems.size
    }


    fun setForecastItems(items: List<ForecastItem>) {
        forecastItems.clear()
        forecastItems.addAll(items)
        notifyDataSetChanged()
    }}