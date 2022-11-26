package com.example.core.domain.model

sealed class GoalType(val name: String) {
    object LoseWeight: GoalType("lose")
    object GainWeight: GoalType("gain")
    object MaintainWeight: GoalType("maintain")

    companion object {
        fun fromString(name: String) :GoalType {
            return when (name) {
                "lose" -> LoseWeight
                "gain" -> GainWeight
                else -> MaintainWeight
            }
        }
    }
}
