package com.example.usupbekov_adilet_homework_3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.usupbekov_adilet_homework_3_7.databinding.ItemListBinding

class RmAdapter (private val rmList: ArrayList<Rm>,
                 private val onClick: (rm:Rm) -> Unit) :
    Adapter<RmAdapter.RmViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RmViewHolder {
        return RmViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
       return rmList.size
    }

    override fun onBindViewHolder(holder: RmViewHolder, position: Int) {
       holder.bind()
    }

    inner class RmViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = rmList[adapterPosition]

            binding.apply {
                tvLife12.text = item.life
                tvName12.text = item.name
                imgCharacter12.setImageResource(item.picture)
            }
            itemView.setOnClickListener{
                onClick.invoke(item)
            }
        }


    }

}
