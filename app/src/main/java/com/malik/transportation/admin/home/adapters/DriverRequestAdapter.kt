package com.malik.transportation.admin.home.adapters


import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.malik.transportation.databinding.CustomDriverRequestsLayoutBinding
import com.malik.transportation.databinding.CustomEducationalLayoutBinding
import com.malik.transportation.databinding.CustomTripsLayoutBinding
import com.malik.transportation.databinding.CustomVehicleRequestLayoutBinding


class DriverRequestAdapter(
    private val context: Context,
    private var mListener: OnItemClickListener,
//    private val reportArrayList: ArrayList<ReportResponse.Data>,
) :
    RecyclerView.Adapter<DriverRequestAdapter.ViewHolder>() {


    interface OnItemClickListener {
        fun onCardClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CustomDriverRequestsLayoutBinding.inflate(
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

    inner class ViewHolder(private val binding: CustomDriverRequestsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.cardView.setOnClickListener {
                mListener.onCardClick(adapterPosition)
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

