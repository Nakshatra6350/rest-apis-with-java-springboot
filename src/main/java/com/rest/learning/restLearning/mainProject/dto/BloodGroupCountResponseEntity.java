package com.rest.learning.restLearning.mainProject.dto;

import com.rest.learning.restLearning.mainProject.entity.type.BloodGroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BloodGroupCountResponseEntity {

    public BloodGroupType getBloodGroupType() {
        return bloodGroupType;
    }

    public BloodGroupCountResponseEntity() {
    }

    public BloodGroupCountResponseEntity(BloodGroupType bloodGroupType, Long count) {
        this.bloodGroupType = bloodGroupType;
        this.count = count;
    }

    public void setBloodGroupType(BloodGroupType bloodGroupType) {
        this.bloodGroupType = bloodGroupType;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    private BloodGroupType bloodGroupType;
    private Long count;
}
