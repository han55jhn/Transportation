package com.malik.transportation.home.adapter


import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.malik.transportation.databinding.CustomTripsLayoutBinding
import java.util.*
import kotlin.collections.ArrayList


class ParentsAvailTripsAdapter(
    private val context: Context,
    private var mListener: OnItemClickListener,
//    private val reportArrayList: ArrayList<ReportResponse.Data>,
) :
    RecyclerView.Adapter<ParentsAvailTripsAdapter.ViewHolder>() {


    interface OnItemClickListener {
        fun onReservationClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CustomTripsLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
//            val report: ReportResponse.Data = reportArrayList[i]
//            viewHolder.bind(report)

    }

    override fun getItemCount(): Int {

        return 5

    }

    inner class ViewHolder(private val binding: CustomTripsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.resBtn.setOnClickListener {
                mListener.onReservationClick(adapterPosition)
            }

        }


        @SuppressLint("SetTextI18n")
//        fun bind(report: ReportResponse.Data) {
        fun bind() {
            binding.apply {


//                reportTv.text = report.name
//                latitudeTv.text = report.maps_lat
//                longitudeTv.text = report.maps_long
//                createdAtTv.text = report.created_at

            }
        }




    }
}

