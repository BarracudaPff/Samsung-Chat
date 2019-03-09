package com.samsung.barracudapff.samsung_chat.models;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.samsung.barracudapff.samsung_chat.R;

public class MessageViewHolder extends RecyclerView.ViewHolder {
    TextView textViewBody;
    TextView textViewTime;

    /**
     * true  -- sent
     * false -- received
     */
    boolean type = true;

    public MessageViewHolder(@NonNull View itemView, boolean type) {
        super(itemView);
        this.type = type;
        textViewBody = itemView.findViewById(R.id.text_message_body);
        textViewTime = itemView.findViewById(R.id.text_message_time);
    }

    public void onBindView(Message message) {
        textViewBody.setText(message.getText());
        textViewTime.setText(message.getTime().toString());
    }
}
