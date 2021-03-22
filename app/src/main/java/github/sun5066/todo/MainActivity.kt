package github.sun5066.todo

import androidx.lifecycle.ViewModelProvider
import github.sun5066.todo.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val mViewModel: MainViewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java) }

    override fun getLayoutResourceId(): Int = R.layout.activity_main

    override fun initDataBinding() {
        mBinding.lifecycleOwner = this
        mBinding.viewmodel = mViewModel
    }

    override fun initView() {

    }

}