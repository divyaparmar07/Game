package com.example.game

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.graphics.Path
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plane = findViewById<ImageView>(R.id.plane)
        val bullet = findViewById<ImageView>(R.id.bullet)
        val ball = findViewById<ImageView>(R.id.ball)
        val ball2 = findViewById<ImageView>(R.id.ball2)
        val ball3 = findViewById<ImageView>(R.id.ball3)
        val ball4 = findViewById<ImageView>(R.id.ball4)
        val ball5 = findViewById<ImageView>(R.id.ball5)
        val ball6 = findViewById<ImageView>(R.id.ball6)
        val ball7 = findViewById<ImageView>(R.id.ball7)
        val ball8 = findViewById<ImageView>(R.id.ball8)
        val ball9 = findViewById<ImageView>(R.id.ball9)
        val ball10 = findViewById<ImageView>(R.id.ball10)

        enemyMovementPath(ball, 18000, 450f, 100f)
        enemyMovementPath(ball2, 20000, 400f, 100f)
        enemyMovementPath(ball3, 22000, 350f, 100f)
        enemyMovementPath(ball4, 25000, 300f, 100f)
        enemyMovementPath(ball5, 27000, 250f, 100f)
        enemyMovementPath(ball6, 29000, 200f, 100f)
        enemyMovementPath(ball7, 31000, 150f, 100f)
        enemyMovementPath(ball8, 33000, 100f, 100f)
        enemyMovementPath(ball9, 35000, 50f, 100f)
        enemyMovementPath(ball10, 37000, 0f, 100f)

        plane.setOnClickListener {
            bullet.visibility = View.VISIBLE
            bulletPath(bullet)
        }

//        enemyMovementPath(ball,10f,100f)
//        enemyMovementPath(ball2, 10f,20f)
//        enemyMovementPath(ball3, 10f,300f)
//        enemyMovementPath(ball4, 10f,400f)
//        enemyMovementPath(ball5, 10f,500f)
//        enemyMovementPath(ball6, 10f,100f)
//        enemyMovementPath(ball7, 10f,200f)
//        enemyMovementPath(ball8, 10f,300f)
//        enemyMovementPath(ball9, 10f,400f)
//        enemyMovementPath(ball10, 10f,500f)

//        val path = Path()
//
//        path.moveTo(10f, 100f) // Start point (x, y)
//        path.lineTo(600f,100f) //ball goes to left 600f y is 100f
//        path.lineTo(600f,200f) //now x remains same but y is goes to 200f
//        path.lineTo(10f,200f) //now y goes to x
//        path.lineTo(10f,300f) //now x remains same but set to 300f x
//        path.lineTo(600f,300f) //now x goes to 600f and y set to 300f
//        path.lineTo(600f,400f) // y set to 400f
//        path.lineTo(10f,400f) // x set to 0f
//        path.lineTo(10f,500f) //y set to 500f
//        path.lineTo(600f,500f) //x set to 600f
//        path.lineTo(600f,600f)//y set to 600f
//        path.lineTo(10f,600f)// x set to 10f
//        path.lineTo(10f,700f) //y set to 700f
//        path.lineTo(600f,700f)// x set to 600f
//        path.lineTo(600f,800f) // y set to 800f
//        path.lineTo(10f,800f)// x set to 10f
//        path.lineTo(10f,900f)//y set to 900f
//        path.lineTo(600f,900f) // x set to 600f
//        path.lineTo(600f,1000f)//y set to 1000f
//        path.lineTo(10f,1000f)//x set to 10f
//        path.lineTo(10f,1100f)//y set to 1100f
//        path.lineTo(600f,1100f)//x set to 600f
//        path.lineTo(600f,1200f)//y set to 1200f
//        path.lineTo(300f,1200f)// x set to 300f
//
//        val anim: ObjectAnimator =
//            ObjectAnimator.ofFloat(ball, View.X, View.Y, path)
//        anim.duration = 12000
//
//        anim.interpolator = AccelerateDecelerateInterpolator()
//
//        anim.start() // Start the animation


//        path.moveTo(10f, 100f)
//        path.lineTo(600f, 100f)

//        val element: View = findViewById(R.id.ball)
//
//        val animator = ObjectAnimator.ofFloat(element, View.X, View.Y, path)
//        animator.duration = 2000
//        animator.start()


    }

    private fun bulletPath(bullet: ImageView) {
        val x: Float = bullet.x
        val y: Float = bullet.y

        val path = Path()
        path.moveTo(x, y)
        path.lineTo(x, y - 100)
        path.lineTo(x, y - 100)
        path.lineTo(x, y - 100)
//        path.lineTo(x,y-100)
//        path.lineTo(x,y-100)
//        path.lineTo(x,y-100)
//        path.lineTo(x,y-100)
//        path.lineTo(x,y-100)
//        path.lineTo(x,y-100)
//        path.lineTo(x,y-100)
//        path.lineTo(x,y-100)
//        path.lineTo(x,y-100)
//        path.lineTo(x,y-100)

        val anim: ObjectAnimator = ObjectAnimator.ofFloat(bullet, View.X, View.Y, path)
        anim.duration = 2000

        anim.interpolator = AccelerateDecelerateInterpolator()

        anim.start() // Start the animation

//        bullet.

    }

    private fun enemyMovementPath(ball: ImageView, i: Long, fl: Float, f2: Float) {
//        enemyMovementPath(ball,12000,10f)
        val path = Path()

        path.moveTo(fl, f2) // Start point (x, y)
        path.lineTo(600f, f2) //ball goes to left 600f y is 100f
        path.lineTo(600f, 200f) //now x remains same but y is goes to 200f
        path.lineTo(10f, 200f) //now y goes to x
        path.lineTo(10f, 300f) //now x remains same but set to 300f x
        path.lineTo(600f, 300f) //now x goes to 600f and y set to 300f
        path.lineTo(600f, 400f) // y set to 400f
        path.lineTo(10f, 400f) // x set to 0f
        path.lineTo(10f, 500f) //y set to 500f
        path.lineTo(600f, 500f) //x set to 600f
        path.lineTo(600f, 600f)//y set to 600f
        path.lineTo(10f, 600f)// x set to 10f
        path.lineTo(10f, 700f) //y set to 700f
        path.lineTo(600f, 700f)// x set to 600f
        path.lineTo(600f, 800f) // y set to 800f
        path.lineTo(10f, 800f)// x set to 10f
        path.lineTo(10f, 900f)//y set to 900f
        path.lineTo(600f, 900f) // x set to 600f
        path.lineTo(600f, 1000f)//y set to 1000f
        path.lineTo(10f, 1000f)//x set to 10f
        path.lineTo(10f, 1100f)//y set to 1100f
        path.lineTo(600f, 1100f)//x set to 600f
        path.lineTo(600f, 1200f)//y set to 1200f
        path.lineTo(0f, 1200f)// x set to 300f

        val anim: ObjectAnimator = ObjectAnimator.ofFloat(ball, View.X, View.Y, path)
        anim.duration = i

        anim.interpolator = AccelerateDecelerateInterpolator()

        anim.start() // Start the animation
        anim.repeatCount = Animation.INFINITE

//        enemyMovementPath(ball, 12000,10f)
    }

//    private fun enemyMovementPath1(ball: ImageView, i: Long, fl: Float,f2 : Float) {
////        enemyMovementPath(ball,12000,10f)
//        val path = Path()
//
//        path.moveTo(fl, f2) // Start point (x, y)
//        path.lineTo(600f, f2) //ball goes to left 600f y is 100f
//        path.lineTo(600f, 200f) //now x remains same but y is goes to 200f
//        path.lineTo(10f, 200f) //now y goes to x
//        path.lineTo(10f, 300f) //now x remains same but set to 300f x
//        path.lineTo(600f, 300f) //now x goes to 600f and y set to 300f
//        path.lineTo(600f, 400f) // y set to 400f
//        path.lineTo(10f, 400f) // x set to 0f
//        path.lineTo(10f, 500f) //y set to 500f
//        path.lineTo(600f, 500f) //x set to 600f
//        path.lineTo(600f, 600f)//y set to 600f
//        path.lineTo(10f, 600f)// x set to 10f
//        path.lineTo(10f, 700f) //y set to 700f
//        path.lineTo(600f, 700f)// x set to 600f
//        path.lineTo(600f, 800f) // y set to 800f
//        path.lineTo(10f, 800f)// x set to 10f
//        path.lineTo(10f, 900f)//y set to 900f
//        path.lineTo(600f, 900f) // x set to 600f
//        path.lineTo(600f, 1000f)//y set to 1000f
//        path.lineTo(10f, 1000f)//x set to 10f
//        path.lineTo(10f, 1100f)//y set to 1100f
//        path.lineTo(600f, 1100f)//x set to 600f
//        path.lineTo(600f, 1200f)//y set to 1200f
//        path.lineTo(0f, 1200f)// x set to 300f
//
//        val anim: ObjectAnimator =
//            ObjectAnimator.ofFloat(ball, View.X, View.Y, path)
//        anim.duration = i
//
//        anim.interpolator = AccelerateDecelerateInterpolator()
//
//        anim.start() // Start the animation
//        anim.repeatCount = Animation.INFINITE;
//
////        enemyMovementPath(ball, 12000,10f)
//    }
}