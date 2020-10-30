package com.example.androidreview.rxjava2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.androidreview.R
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_rxjava2.*
import java.util.concurrent.Callable
import java.util.concurrent.FutureTask
import java.util.concurrent.TimeUnit


class Rxjava2Activity : AppCompatActivity() {

    val tag = "Rxjava2Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rxjava2)

        base_btn.setOnClickListener {
            val observable = Observable.create(ObservableOnSubscribe<Int> {
                Log.e(
                    tag,
                    "=========================currentThread name: " + Thread.currentThread().name
                )

                it.onNext(1)
                it.onNext(2)
                it.onNext(3)
                it.onComplete()
            })

            val observer = object : Observer<Int> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(tag, "======================onSubscribe")
                }

                override fun onNext(t: Int) {
                    Log.e(tag, "======================onNext + $t")
                }

                override fun onError(e: Throwable) {
                    Log.e(tag, "======================onError")
                }

                override fun onComplete() {
                    Log.e(tag, "======================onComplete")
                }

            }

            observable.subscribe(observer)
        }

        just_btn.setOnClickListener {
            Observable.just(1, 2, 3)
                .subscribe(object : Observer<Int> {
                    override fun onSubscribe(d: Disposable) {
                        Log.e(tag, "======================onSubscribe")
                    }

                    override fun onNext(t: Int) {
                        Log.e(tag, "======================onNext + $t")
                    }

                    override fun onError(e: Throwable) {
                        Log.e(tag, "======================onError")
                    }

                    override fun onComplete() {
                        Log.e(tag, "======================onComplete")
                    }

                })
        }

        from_array_btn.setOnClickListener {
            val arrayOf = arrayOf(1, 2, 3, 4)
            Observable.fromArray(*arrayOf).subscribe(object : Observer<Int> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(tag, "======================onSubscribe")
                }

                override fun onNext(t: Int) {
                    Log.e(tag, "======================onNext $t")
                }

                override fun onError(e: Throwable) {
                    Log.e(tag, "======================onError")
                }

                override fun onComplete() {
                    Log.e(tag, "======================onComplete")
                }

            })
        }

        from_callable_btn.setOnClickListener {
            Observable.fromCallable { 1 }
                .subscribe { t -> Log.e(tag, "================accept $t") }
        }

        from_future_btn.setOnClickListener {
            val futureTask = FutureTask(Callable<String> {
                Log.e(tag, "CallableDemo is Running")
                return@Callable "返回结果"
            })

            Observable.fromFuture(futureTask)
                .doOnSubscribe {
                    futureTask.run()
                }.subscribe {
                    Log.e(tag, "================accept $it")
                }
        }

        from_iterable_btn.setOnClickListener {
            val list = listOf(0, 1, 2, 3)

            Observable.fromIterable(list).subscribe(object : Observer<Int> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(tag, "======================onSubscribe")
                }

                override fun onNext(t: Int) {
                    Log.e(tag, "======================onNext $t")
                }

                override fun onError(e: Throwable) {
                    Log.e(tag, "======================onError")
                }

                override fun onComplete() {
                    Log.e(tag, "======================onComplete")
                }

            })
        }

        defer_btn.setOnClickListener {
            var i = 100

            val observable = Observable.defer {
                Observable.just(i)
            }

            i = 200

            val observer = object : Observer<Int> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(tag, "======================onSubscribe")
                }

                override fun onNext(t: Int) {
                    Log.e(tag, "======================onNext $t")
                }

                override fun onError(e: Throwable) {
                    Log.e(tag, "======================onError")
                }

                override fun onComplete() {
                    Log.e(tag, "======================onComplete")
                }

            }

            observable.subscribe(observer)

            i = 300
            observable.subscribe(observer)
        }

        timer_btn.setOnClickListener {
            Observable.timer(2, TimeUnit.SECONDS).subscribe(object : Observer<Long> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(tag, "======================onSubscribe")
                }

                override fun onNext(t: Long) {
                    Log.e(tag, "======================onNext $t")
                }

                override fun onError(e: Throwable) {
                    Log.e(tag, "======================onError")
                }

                override fun onComplete() {
                    Log.e(tag, "======================onComplete")
                }

            })
        }

        interval_btn.setOnClickListener {
            Observable.interval(4, TimeUnit.SECONDS).subscribe(object : Observer<Long> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(tag, "======================onSubscribe")
                }

                override fun onNext(t: Long) {
                    Log.e(tag, "======================onNext $t")
                }

                override fun onError(e: Throwable) {
                    Log.e(tag, "======================onError")
                }

                override fun onComplete() {
                    Log.e(tag, "======================onComplete")
                }

            })
        }

        interval_range_btn.setOnClickListener {
            Observable.intervalRange(2, 5, 2, 1, TimeUnit.SECONDS)
                .subscribe(object : Observer<Long> {
                    override fun onSubscribe(d: Disposable) {
                        Log.e(tag, "======================onSubscribe")
                    }

                    override fun onNext(t: Long) {
                        Log.e(tag, "======================onNext $t")
                    }

                    override fun onError(e: Throwable) {
                        Log.e(tag, "======================onError")
                    }

                    override fun onComplete() {
                        Log.e(tag, "======================onComplete")
                    }

                })
        }

        range_btn.setOnClickListener {

            Observable.range(2, 5).subscribe(object : Observer<Int> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(tag, "======================onSubscribe")
                }

                override fun onNext(t: Int) {
                    Log.e(tag, "======================onNext $t")
                }

                override fun onError(e: Throwable) {
                    Log.e(tag, "======================onError")
                }

                override fun onComplete() {
                    Log.e(tag, "======================onComplete")
                }

            })
        }

        map_btn.setOnClickListener {
            Observable.just(1, 2, 3).map {
                "I'm $it"
            }.subscribe(object : Observer<String> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(tag, "======================onSubscribe")
                }

                override fun onNext(t: String) {
                    Log.e(tag, "======================onNext $t")
                }

                override fun onError(e: Throwable) {
                    Log.e(tag, "======================onError")
                }

                override fun onComplete() {
                    Log.e(tag, "======================onComplete")
                }

            })
        }

        flat_map_btn.setOnClickListener {

            val actionList1 = arrayListOf("action1", "action2", "action3")
            val actionList2 = arrayListOf("action4", "action5", "action6")
            val actionList3 = arrayListOf("action7", "action8", "action9")

            val plan1 = Plan("time1", "content1", actionList1)
            val plan2 = Plan("time2", "content2", actionList2)
            val plan3 = Plan("time3", "content3", actionList3)

            val planList1 = arrayListOf(plan1, plan2, plan3)
            val planList2 = arrayListOf(plan1, plan2)

            val person1 = Person("name1", planList1)
            val person2 = Person("name2", planList2)
            val personList = arrayListOf(person1, person2)

            Observable.fromIterable(personList).flatMap {
                Observable.fromIterable(it.planList)
            }.flatMap {
                Observable.fromIterable(it.actionList)
            }.subscribe(object : Observer<String> {
                override fun onSubscribe(d: Disposable) {
                    Log.e(tag, "======================onSubscribe")
                }

                override fun onNext(t: String) {
                    Log.e(tag, "======================onNext $t")
                }

                override fun onError(e: Throwable) {
                    Log.e(tag, "======================onError")
                }

                override fun onComplete() {
                    Log.e(tag, "======================onComplete")
                }
            })
        }
    }
}