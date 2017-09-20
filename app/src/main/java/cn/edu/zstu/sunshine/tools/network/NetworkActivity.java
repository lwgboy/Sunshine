package cn.edu.zstu.sunshine.tools.network;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import cn.edu.zstu.sunshine.R;
import cn.edu.zstu.sunshine.base.BaseActivity;
import cn.edu.zstu.sunshine.databinding.ActivityNetworkBinding;

public class NetworkActivity extends BaseActivity {

    private ActivityNetworkBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_network);
        binding.setViewModel(new NetworkViewModel(this, binding));

        initToolBar();
    }

    private void initToolBar() {
        binding.includeTitle.toolbar.setTitle(R.string.title_activity_network);
        binding.includeTitle.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
