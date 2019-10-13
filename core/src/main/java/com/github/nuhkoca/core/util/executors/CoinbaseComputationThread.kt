package com.github.nuhkoca.core.util.executors

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class CoinbaseComputationThread @Inject constructor() : ComputationThread {
    override val scheduler: Scheduler
        get() = Schedulers.computation()
}
