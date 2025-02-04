package com.example.myapplication.ui.adapters

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class CategoryAdapter(private val categories: List<String>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    // List of predefined colors
    private val colors = listOf(
        "#F93827", // Red
        "#FF9D23", // Orange
        "#FFD65A", // Yellow
        "#16C47F", // Green
        "#0D92F4", // Blue
        "#8A2BE2", // BlueViolet
        "#FF33A8", // Pink
        "#00FA9A", // MediumSpringGreen
        "#8E3E63"  // GreatPurple
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.bind(category, position)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val categoryTextView: TextView = itemView.findViewById(R.id.textViewCategoryName)
        private val cardViewBackground: View = itemView.findViewById(R.id.cardview_background)

        // Bind the category name and set a fixed background color with gradient
        fun bind(category: String, position: Int) {
            categoryTextView.text = category

            // Get color based on position, ensuring it loops through all available colors
            val color = colors[position % colors.size]

            // Create a gradient drawable for the background
            val gradientDrawable = GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                intArrayOf(Color.parseColor(color), Color.parseColor(color)) // Use intArray instead of Array
            )
            gradientDrawable.cornerRadius = 12f // Add rounded corners to the gradient background

            // Set the gradient drawable as background
            cardViewBackground.background = gradientDrawable
        }
    }
}
