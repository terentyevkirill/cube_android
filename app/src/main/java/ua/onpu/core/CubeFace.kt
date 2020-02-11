package ua.onpu.core

class CubeFace private constructor() {

    companion object {

        const val CALIBRATING = -1

        fun fromCoordinates(x: Float, y: Float): Int {
            return when {
                matches(actual = x, expected = 0F) && matches(actual = y, expected = 0F) -> 1
                matches(actual = x, expected = 90F) && matches(actual = y, expected = 0F) -> 2
                matches(actual = y, expected = -90F) -> 3
                matches(actual = x, expected = -90F) && matches(actual = y, expected = 0F) -> 4
                matches(actual = y, expected = 90F) -> 5
                matches(actual = x, expected = 180F) || matches(actual = x, expected = -180F)
                        && matches(actual = y, expected = 0F) -> 6
                else -> CALIBRATING
            }
        }

        private fun matches(actual: Float, expected: Float, delta: Float = 35F): Boolean {
            val minBound = expected - delta
            val maxBound = expected + delta
            return actual in minBound..maxBound
        }
    }

}