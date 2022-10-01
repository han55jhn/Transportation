package com.malik.transportation.home.adapter


import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.malik.transportation.databinding.CustomDriverOrderLayoutBinding
import com.malik.transportation.databinding.CustomDriverRequestsLayoutBinding
import com.malik.transportation.databinding.CustomStudentRequestsLayoutBinding
import com.malik.transportation.databinding.CustomTripRequestLayoutBinding
import com.malik.transportation.databinding.CustomTripsLayoutBinding
import java.util.*
import kotlin.collections.ArrayList


class TripRequestsAdapter(
    private val context: Context,
//    private var mListener: OnItemClickListener,
//    private val reportArrayList: ArrayList<ReportResponse.Data>,
) :
    RecyclerView.Adapter<TripRequestsAdapter.ViewHolder>() {


    interface OnItemClickListener {
//        fun onCardClick(position: Int, reportArrayList: ArrayList<ReportResponse.Data>,reportNameRoomList: List<CreateReportRoomResponse>)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CustomTripRequestLayoutBinding.inflate(
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

    inner class ViewHolder(private val binding: CustomTripRequestLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
//            binding.deleteBtn.setOnClickListener {
//                mListener.onDeleteClick(adapterPosition, reportArrayList,reportNameRoomList)
//            }

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

