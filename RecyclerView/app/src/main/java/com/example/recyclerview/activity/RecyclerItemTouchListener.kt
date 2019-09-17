package com.example.recyclerview.activity

import android.content.Context
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView

class RecyclerItemTouchListener : RecyclerView.OnItemTouchListener {

    val mGestureDetector : GestureDetector
    val mListener : OnItemClickListener

    constructor(context: Context, rView: RecyclerView, listener: OnItemClickListener) {
        mListener = listener

        mGestureDetector = GestureDetector(context, object : GestureDetector.SimpleOnGestureListener(){
            override fun onSingleTapUp(e: MotionEvent?): Boolean {
                return true
            }

            override fun onLongPress(e: MotionEvent?) {
                val child = rView.findChildViewUnder(e?.x!!, e.y)
                if(child != null)
                    mListener.onLongItemClick(child, rView.getChildAdapterPosition(child))
            }
        })
    }

    interface OnItemClickListener : AdapterView.OnItemClickListener {
        fun onItemClick(view: View, position: Int)
        fun onLongItemClick(view: View, position: Int)
    }

    override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
        val childView = rv.findChildViewUnder(e.x, e.y)
        if(childView != null && mGestureDetector.onTouchEvent(e)) {
            mListener.onItemClick(childView, rv.getChildAdapterPosition(childView))
        }

        return true
    }

    override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {  }
    override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) { }

}