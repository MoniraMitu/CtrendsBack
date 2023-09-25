package com.mitu.cTrendsBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp extends BaseEntity{
//    private Id , Code, Name, Dob, Gender, Mobile, DeptId
   @Column(nullable = false, length = 4)
   @NotNull(message = "code can not be empty")
   private String code;

   @Column(nullable = false )
   @NotNull(message = "dob can not be empty")
   private LocalDate dob;

    @Column(nullable = false)
    @NotNull(message = "gender can not be empty")
   private Gender gender;

   private String mobile;

    @Column(nullable = false)
    @NotNull(message = "deptId can not be empty")
    private Long deptId;






}
