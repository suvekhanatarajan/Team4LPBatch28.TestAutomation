package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrmPages {
	  WebDriver driver;
	   @FindBy(id="txtUsername")
	   WebElement Username;
	   public WebElement getUsername()
	   {
		  return Username;
	   }
	   
	   @FindBy(id="txtPassword")
	   WebElement Pwd;
	   public WebElement getPwd()
	   {
		  return Pwd;
	   }
	   
	   @FindBy(id="btnLogin")
	   WebElement LoginBtn;
	   public WebElement getLoginBtn()
	   {
		  return LoginBtn;
	   }
	   
	   @FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]")
	    WebElement admin;
	    public WebElement getAdminBtn() {
	    	return admin;
	    }
	    @FindBy(xpath="//*[@id=\"menu_admin_UserManagement\"]")
	    WebElement userManagement;
	    public WebElement getUserManagementBtn() {
	    return userManagement;
	    }
	    @FindBy(xpath="//*[@id=\"menu_admin_viewSystemUsers\"]")
	    WebElement user;
	    public WebElement getUser() {
	    	return user;
	    }
	    @FindBy(xpath="//*[@id=\"searchSystemUser_userName\"]")
	    WebElement searchUserName;
	    public WebElement getSearchUserName() {
	    	return searchUserName;
	    }
	    @FindBy(xpath="//*[@id=\"searchSystemUser_userType\"]")
	    WebElement searchUserRoll;
	    public Select getSearchUserRoll() {
	    	Select dropDown=new Select(searchUserRoll);
	    	return dropDown;
	    }
	    @FindBy(xpath="//*[@id=\"searchSystemUser_employeeName_empName\"]")
	    WebElement searchEmployeeName;
	    public WebElement getSearchEmployeeName() {
	    	return searchEmployeeName;
	    }
	    @FindBy(xpath="//*[@id=\"searchSystemUser_status\"]")
	    WebElement searchStatus;
	    public Select getSearchStatus() {
	    	Select dropDown=new Select(searchStatus);
	    	return dropDown;
	    	
	    }
	    @FindBy(xpath="//*[@id=\"searchBtn\"]")
	    WebElement searchButton;
	    public WebElement getSearchButton() {
	    	return searchButton;
	    }
	    @FindBy(xpath="//*[@id=\"systemUser_userType\"]")
	    WebElement addUserRoll;
	    public Select getAddUserRoll() {
	    	Select dropDown=new Select(addUserRoll);
	    	return dropDown;
	    }
	    @FindBy(xpath="//*[@id=\"systemUser_employeeName_empName\"]")
	    WebElement addEmployeeName;
	    public WebElement getAddEmployeeName() {
	    	return addEmployeeName;
	    }
	    @FindBy(xpath="//*[@id=\"systemUser_userName\"]")
	    WebElement addUserName;
	    public WebElement getAddUserName() {
	    	return addUserName;
	    }
	     @FindBy(xpath="//*[@id=\"systemUser_status\"]")
	    WebElement addStatus;
	    public Select getAddStatus() {
	    	Select dropDown=new Select(addStatus);
	    	return dropDown;
	    }
	    @FindBy(xpath="//*[@id=\"systemUser_password\"]")
	    WebElement addPassword;
	    public WebElement getAddPassword() {
	    	return addPassword;
	    }
	    @FindBy(xpath="//*[@id=\"systemUser_confirmPassword\"]")
	    WebElement addConfirmPassword;
	    public WebElement getAddConfirmPassword() {
	    	return addConfirmPassword;
	    }
	    @FindBy(xpath="//*[@id=\"menu_admin_Qualifications\"]")
	    WebElement qualificationButton;
	    public WebElement getQualificationButton() {
	    return qualificationButton;
	    }
	    //skills
	    @FindBy(xpath="//*[@id=\"menu_admin_viewSkills\"]")
	    WebElement skillsButton;
	    public WebElement getSkillsButton() {
	    	return skillsButton;
	    }
	    @FindBy(xpath="//*[@id=\"skill_name\"]")
	    WebElement skillsTextBox;
	    public WebElement getSkillsTextBox() {
	    	return skillsTextBox;
	    }
	  
	    @FindBy(xpath="//*[@id=\"skill_description\"]")
	    WebElement skillsDescriptionBox;
	    public WebElement getSkillsDescriptiontBox() {
	    	return skillsDescriptionBox;
	    }
	    @FindBy(xpath="//*[@id=\"menu_admin_viewEducation\"]")
	    WebElement educationButton;
	    public WebElement getEducationButton() {
	    	return educationButton;
	    }
	    @FindBy(xpath="//*[@id=\"education_name\"]")
	    WebElement educationTextBox;
	    public WebElement getEducationTextBox() {
	    	return educationTextBox;
	    }
	   //LICENSE 
	    @FindBy(xpath="//*[@id=\"menu_admin_viewLicenses\"]")
	    WebElement licensesButton;
	    public WebElement getLicensesButton() {
	    	return licensesButton;
	    }
	    @FindBy(xpath="//*[@id=\"license_name\"]")
	    WebElement licensesNameTextBox;
	    public WebElement getLicensesNameTextBox() {
	    	return licensesNameTextBox;
	    }
	    //language
	    @FindBy(xpath="//*[@id=\"menu_admin_viewLanguages\"]")
	    WebElement languagesButton;
	    public WebElement getLanguagesButton() {
	    	return languagesButton;
	    }
	    @FindBy(xpath="//*[@id=\"language_name\"]")
	    WebElement languagesNameTextBox;
	    public WebElement getLanguagesNameTextBox() {
	    	return languagesNameTextBox;
	    }
	    //Membership
	    @FindBy(xpath="//*[@id=\"menu_admin_membership\"]")
	    WebElement MembershipsButton;
	    public WebElement getMembershipsButton() {
	    	return MembershipsButton;
	    }
	    @FindBy(xpath="//*[@id=\"membership_name\"]")
	    WebElement membershipNameTextBox;
	    public WebElement getMembershipNameTextBox() {
	    	return membershipNameTextBox;
	    }
	   //add,save,cancel
	    @FindBy(id="btnAdd")
	    WebElement addButton;
	    public WebElement getAddButton() {
	    	return addButton;
	    }
	    @FindBy(id="btnSave")
	    WebElement saveButton;
	    public WebElement getSaveButton() {
	    	return saveButton;
	    }
	    @FindBy(xpath="//*[@id=\"btnCancel\"]")
	    WebElement CancelButton;
	    public WebElement getCancelButton() {
	    	return CancelButton;
	    }
	    
	    @FindAll(@FindBy(xpath="//*[@id=\"btnCancel\"]"))
	    WebElement table;
	    public WebElement getTable() {
	    	return table;
	    }
	    
	   @FindBy(id="menu_dashboard_index")
	   WebElement DashBoard;
	   public WebElement getDashBoard()
	   {
		   return DashBoard;
	   }
	   
	   @FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img")
	   WebElement AssignLeaveBtn;
	   public WebElement getAssignLeaveBtn()
	   {
		   return AssignLeaveBtn;
	   }
	   
	   @FindBy(id="assignleave_txtEmployee_empName")
	   WebElement EmpName;
	   public WebElement getEmpNmae()
	   {
		   return EmpName;
	   }
	   
	   @FindBy(id="assignleave_txtLeaveType")
	   WebElement LeaveType;
	   public Select getLeaveType()
	   {
		   Select LeaveTypeSelect=new Select(LeaveType);
		   return LeaveTypeSelect;
	   }
	   
	  @FindBy(xpath="//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[4]/img")
	  WebElement Calender;
	  public WebElement getCalender()
	  {
		  return Calender;
	  }
	  
	  @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
	  WebElement Month;
	  public Select getMonth()
	  {
		  Select MonthList=new Select(Month);
		  return MonthList;
	  }
	  

	  @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
	  WebElement Year;
	  public Select getYear()
	  {
		  Select YearList=new Select(Year);
		  return YearList;
	  }
	  
	  @FindAll(@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"))
	  List<WebElement> Date;
	  public List<WebElement>  getDate()
	  {
		  return Date;
	  }
	  
	  @FindBy(xpath="//*[@id=\"assignBtn\"]")
	   WebElement AssignBtn;
	   public WebElement getAssignBtn()
	   {
		  return AssignBtn;
	   }
	   
	   @FindBy(id="confirmOkButton")
	   WebElement OkBtn;
	   public WebElement getOkBtn()
	   {
		  return OkBtn;
	   }
	   
	   @FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[2]/div/a/img")
	   WebElement LeaveListBtn;
	   public WebElement getLeaveListBtn()
	   {
		   return LeaveListBtn;
	   }
	   
	   @FindBy(id="leaveList_chkSearchFilter_checkboxgroup_allcheck")
	   WebElement AllLeaveStatus;
	   public WebElement getAllLeaveStatus()
	   {
		   return AllLeaveStatus;
	   }
	   
	   @FindBy(id="btnSearch")
	   WebElement SearchBtn;
	   public WebElement getSearchBtn()
	   {
		   return SearchBtn;
	   }
	   
	   @FindBy(id="leaveList_txtEmployee_empName")
	   WebElement Empname;
	   public WebElement getEmpname()
	   {
		   return Empname;
	   }
	   
	   @FindBy(id="btnReset")
	   WebElement ResetBtn;
	   public WebElement getResetBtn()
	   {
		   return ResetBtn;
	   }
	   
	   @FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[3]/div/a/img")
	   WebElement TimeSheetBtn;
	   public WebElement getTimeSheetBtn()
	   {
		   return TimeSheetBtn;
	   }
	   
	   @FindBy(id="employee")
	   WebElement TSEmpname;
	   public WebElement getTSEmpname()
	   {
		   return TSEmpname;
	   }
	   
	   @FindBy(id="btnView")
	   WebElement ViewBtn;
	   public WebElement getViewBtn()
	   {
		   return ViewBtn;
	   }
	   
	   @FindBy(xpath="//*[@id=\"content\"]/div[1]/div[1]/h1")
	   WebElement OverlapMsg;
	   public WebElement getOverlapMsg()
	   {
		   return OverlapMsg;
	   }
	   
	   @FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[6]/div/a/img")
	   WebElement MyTimeSheetBtn;
	   public WebElement getMyTimeSheetBtn()
	   {
		   return MyTimeSheetBtn;
	   }
	   
	   @FindBy(xpath="//*[@id=\"content\"]/div/div")
	   WebElement NoTimeSheet;
	   public WebElement getNoTimeSheet()
	   {
		   return NoTimeSheet;
	   }
	   
	   @FindBy(id="btnEdit")
	   WebElement EditBtn;
	   public WebElement getEditBtn()
	   {
		   return EditBtn;
	   }
	   
	  @FindBy(id="initialRows_0_projectName")
	  WebElement PrjctNameField;
	  public WebElement getPrjctNameField()
	   {
		   return PrjctNameField;
	   }
	  
	  @FindBy(xpath="//div[@class=\"ac_results\"]")
	  WebElement PrjctName;
	  public WebElement getPrjctName()
	  {
		  //Select Prjct=new Select(PrjctName);
		  return PrjctName;
	  }
	  
	  @FindBy(id="initialRows_0_projectActivityName")
	  WebElement ActivityName;
	  public Select getActivityName()
	  {
		  Select Activity=new Select(ActivityName);
		  return Activity;
	  }
	  
	  @FindBy(xpath="//*[@id=\"initialRows_0_0\"]")
	  WebElement Days;
	  public WebElement getDays()
	  {
		  return Days;
	  }
	  
	  @FindBy(id="submitSave")
	   WebElement SaveBtn;
	   public WebElement getSaveBtn()
	   {
		   return SaveBtn;
	   }
	   
	   @FindBy(xpath="//*[@id=\"menu_pim_viewMyDetails\"]/b")
		WebElement Myinfo;
		
		public WebElement getMyinfo() {
			return Myinfo;
		}
		
		@FindBy(id="btnSave")
		WebElement MyInfoEditBtn;
		
		public WebElement getMyInfoEditBtn() {
			return MyInfoEditBtn;
		}
		
		@FindBy(name="personal[txtEmpFirstName]")
		WebElement FirstnameTxtField;
		
		public WebElement getFirstnameTxtField() {
			return FirstnameTxtField;
		}
		
		@FindBy(name="personal[txtEmpMiddleName]")
		WebElement MiddlenameTxtField;
		
		public WebElement getMiddlenameTxtField() {
			return MiddlenameTxtField;
		}
			
		@FindBy(name="personal[txtEmpLastName]")
		WebElement LastnameTxtField;
		
		public WebElement getLastnameTxtField() {
			return LastnameTxtField;
		}
		
		@FindBy(id="personal_optGender_2")  
		WebElement FemaleRadioBtn;
		
		public WebElement getFemaleRadioBtn() {
			return FemaleRadioBtn;
		}
		
		@FindBy(id="personal_optGender_1")   
		WebElement MaleRadioBtn;
		
		public WebElement getMaleRadioBtn() {
			return MaleRadioBtn;
		}
		
		@FindBy(id="personal_txtEmployeeId")
		WebElement EmployeeId;
		
		public WebElement getEmployeeId() {
			return EmployeeId; 
		}
		
		@FindBy(name="personal[cmbMarital]")
		WebElement Status;
		
		public Select getStatus() {
			Select statussel=new Select(Status);
			return statussel;
		}
		
		@FindBy(name="personal[cmbNation]")
		WebElement Country;
		
		public Select getCountry() {
			Select countrysel=new Select(Country);
			return countrysel;
		}
		
		@FindBy(id="personal_DOB")
		WebElement DOB;
		
		public WebElement getDOB() {
			return DOB; 
		}
		@FindBy(id="btnSave")
		WebElement PersonalinfoSaveBtn;
		
		public WebElement getPersonalinfoSaveBtn() {
			return PersonalinfoSaveBtn; 
		}	
		@FindBy(xpath="//*[@id=\"sidenav\"]/li[2]/a")
		WebElement ContactDetails;
		
		public WebElement getContactDetails() {
			return ContactDetails; 	
		}
		
		@FindBy(name="contact[street1]")
		WebElement AddressStreet; 
		
		public WebElement getAddressStreet() {
			return AddressStreet; 	
		}
		@FindBy(id="contact_city")
		WebElement City; 
		
		public WebElement getCity() {
			return City; 	
		}
		
		@FindBy(id="contact_province")
		WebElement State; 
		
		public WebElement getState() {
			return State; 	
		}
		@FindBy(name="contact[emp_zipcode]")
		WebElement Zipcode; 
		
		public WebElement getZipcode() {
			return Zipcode; 	
		}
		
		@FindBy(name="contact[country]")
		WebElement CtCountry;
		
		public Select getCtCountry() {
			Select countrysel=new Select(CtCountry);
			return countrysel;
		}
		@FindBy(name="contact[emp_mobile]")
		WebElement Mobilenumber; 
		
		public WebElement getMobilenumber() {
			return Mobilenumber; 	
		}
		
		@FindBy(name="contact[emp_work_email]")
		WebElement Email; 
				
		public WebElement getEmail() {
		return Email;
		}
		
		@FindBy(xpath="//*[@id=\"sidenav\"]/li[3]/a")
		WebElement EmergencyContacts;
		
		public WebElement getEmergencyContacts() {
			return EmergencyContacts; 	
		}
		
		@FindBy(id="btnAddContact") 
		WebElement AddBtn; 
				
		public WebElement getAddBtn() {
		return AddBtn;
		}
		@FindBy(id="emgcontacts_name") 
		WebElement Emgname; 
				
		public WebElement getEmgname() {
		return Emgname;
		}
		
		@FindBy(id="emgcontacts_relationship")
		WebElement EmgRelationship; 
				
		public WebElement getEmgRelationship() {
		return EmgRelationship;
		}
		
		@FindBy(id="emgcontacts_homePhone")
		WebElement EmgHomephone; 
				
		public WebElement getEmgHomephone() {
		return EmgHomephone;
		}
		
		@FindBy(id="emgcontacts_mobilePhone")
		WebElement EmgMobilenmbr; 
				
		public WebElement getEmgMobilenmbr() {
		return EmgMobilenmbr;
		}
		
		@FindBy(id="emgcontacts_workPhone")
		WebElement EmgWorkphone; 
				
		public WebElement getWorkphone() {
		return EmgWorkphone;
		}
		
		@FindBy(id="btnSaveEContact")
		WebElement ContactSaveBtn; 
				
		public WebElement getContactSaveBtn() {
		return ContactSaveBtn;
		}
		
		@FindBy(xpath="//*[@id=\"sidenav\"]/li[4]/a")
		WebElement Dependents;
		
		public WebElement getDependents() {
			return Dependents; 	
		}
		
		@FindBy(id="btnAddDependent")
		WebElement AddDTBtn; 
				
		public WebElement getAddDTBtn() {
		return AddDTBtn;
		}
		
		@FindBy(id="dependent_name")
		WebElement Dtname; 
				
		public WebElement getDtname() {
		return Dtname;
		}
		
		@FindBy(id="dependent_relationshipType") 
		WebElement DTRelationship;
		
		public Select getDTRelationship() {
			Select Dtsel=new Select(DTRelationship);
			return Dtsel;
		}
		
		@FindBy(id="dependent_dateOfBirth")
		WebElement DTDOB;
		
		public WebElement getDTDOB() {
			return DTDOB; 
		}
		
		@FindBy(id="btnSaveDependent")
		WebElement DTsaveBtn;
		
		public WebElement getDTsaveBtn() {
			return DTsaveBtn; 
		}
		
		@FindBy(xpath="//*[@id=\"sidenav\"]/li[5]/a")
		WebElement Immigration;
		
		public WebElement getImmigration() {
			return Immigration; 	
		}
		
		@FindBy(id="btnAdd")
		WebElement AddImmigrationBtn;
		
		public WebElement getAddImmigrationBtn() {
			return AddImmigrationBtn; 
		}
		
		@FindBy(id="immigration_number")
		WebElement AddPassportNmbr;
		
		public WebElement getAddPassportNmbr() {
			return AddPassportNmbr; 
		}
		
		@FindBy(id="btnSave")
		WebElement ImmigrationsaveBtn;
		
		public WebElement getImmigrationsaveBtn() {
			return ImmigrationsaveBtn; 
		}
		
		@FindBy(xpath="//*[@id=\"sidenav\"]/li[10]/a")
		WebElement Qualification;
		
		public WebElement getQualification() {
			return Qualification; 	
		}
		
		@FindBy(id="addWorkExperience")
		WebElement AddWorkExpBtn;
		
		public WebElement getAddWorkExpBtn() {
			return AddWorkExpBtn; 
		}
		
		@FindBy(id="experience_employer")
		WebElement Company;
		
		public WebElement getCompany() {
			return Company; 
		}
		
		@FindBy(id="experience_jobtitle")
		WebElement JobTitle;
		
		public WebElement getJobTitle() {
			return  JobTitle; 
		} 
		
		@FindBy(id="btnWorkExpSave")
		WebElement SaveWorkExpBtn;
		
		public WebElement getSaveWorkExpBtn() {
			return SaveWorkExpBtn; 
		}
		
		@FindBy(id="addEducation")
		WebElement AddEducationBtn;
		
		public WebElement getAddEducationBtn() {
			return AddEducationBtn; 
		}
		
		@FindBy(id="education_code") 
		WebElement Educationlevel;
		
		public Select getEducationlevel() {
			Select Esel=new Select(Educationlevel);
			return Esel;
		}
			
		@FindBy(id="education_institute")
		WebElement Institute;
		
		public WebElement getInstitute() {
			return Institute; 
		}
		
		@FindBy(id="education_major")
		WebElement Specialization;
		
		public WebElement getSpecialization() {
			return Specialization; 
		}
		@FindBy(id="education_year")
		WebElement EducationYear;
		
		public WebElement getEducationYear() {
			return EducationYear; 
		}
		
		@FindBy(id="education_gpa") 
		WebElement EducationGPA;
		
		public WebElement getEducationGPA() {
			return EducationGPA; 
		}
		
		@FindBy(id="education_start_date") 
		WebElement EducationSrtDate;
		
		public WebElement getEducationSrtDate() {
			return EducationSrtDate; 
		}
		@FindBy(id="education_end_date") 
		WebElement EducationEndDate;
		
		public WebElement getEducationEndDate() {
			return EducationEndDate; 
		}
		
		@FindBy(id="btnEducationSave") 
		WebElement SaveEdBtn;
		
		public WebElement getSaveEdBtn() {
			return SaveEdBtn; 
		}
		
		@FindBy(id="addSkill") 
		WebElement AddSkilldBtn;
		
		public WebElement getAddSkillBtn() {
			return AddSkilldBtn; 
		}
		
		@FindBy(id="skill_code") 
		WebElement Skill;
		
		public Select getSkill() {
			Select Skillsel=new Select(Skill);
			return Skillsel;
		}
		
		@FindBy(xpath="//select[@id='skill_code']") 
		WebElement YearsOfExp;
		
		public WebElement getYearsOfExp() {
			return  YearsOfExp; 
		}
		
		@FindBy(id="skill_comments") 
		WebElement Comments;
		
		public WebElement getComments() {
			return  Comments; 
		}
		
		@FindBy(id="btnSkillSave") 
		WebElement SaveSkillBtn;
		
		public WebElement getSaveSkillBtn() {
			return  SaveSkillBtn; 
		}
		
		@FindBy(id="addLanguage") 
		WebElement AddLanguageBtn;
		
		public WebElement getAddLanguageBtn() {
			return  AddLanguageBtn; 
		}
		
		@FindBy(id="language_code") 
		WebElement Language;
		
		public Select getLanguage() {
			Select Esel=new Select(Language);
			return Esel;
		}
		
		@FindBy(id="language_lang_type") 
		WebElement Fluency;
		
		public Select getFluency() {
			Select Esel=new Select(Fluency);
			return Esel;
		}
		
		@FindBy(id="language_competency") 
		WebElement Competency;
		
		public Select getCompetency() {
			Select Esel=new Select(Competency);
			return Esel;
		}
		
		@FindBy(id="btnLanguageSave") 
		WebElement LanguageSaveBtn;
		
		public WebElement getLanguageSaveBtn() {
			return  LanguageSaveBtn; 
		}
		
		
		
		
		//KalaiMani
		@FindBy(xpath="//b[contains(text(),'PIM')]") 
		WebElement PIMBtn;
		public WebElement getPIMBtn() {
			return	PIMBtn;
		}
		@FindBy(id="menu_pim_Configuration")
		WebElement ConfigurationDropDown;
		public WebElement getConfigurationDropDown() {
			return	ConfigurationDropDown;
		}
		
		@FindBy(id="menu_pim_configurePim")
		WebElement configurePim;
		public WebElement getconfigurePim() {
			return configurePim;
		}
		@FindBy(id="menu_pim_listCustomFields")
		WebElement CustomFields;
		public WebElement getCustomFields() {
		return CustomFields;
		}
		@FindBy(id="menu_admin_pimCsvImport")
		WebElement DataImport;
		public WebElement getDataImport() {
		return DataImport;
	}
		@FindBy(id="menu_pim_viewReportingMethods")
	    WebElement	ReportingMethods;
		public WebElement getReportingMethods() {
		return	ReportingMethods;		
				}
		@FindBy(id="menu_pim_viewTerminationReasons")
		WebElement TerminationReasons;
		public WebElement getTerminationReasons() {
			return TerminationReasons;
		}
		@FindBy(id="menu_pim_viewEmployeeList")
		WebElement EmpList;
		public WebElement getEmpList() {
			return EmpList;
		}
		@FindBy(id="empsearch_employee_name_empName")
		WebElement PIMEmpName;
		public WebElement getPIMEmpName() {
			return  PIMEmpName;
		}
		@FindBy(id="empsearch_id")
		WebElement EmpId;
		public WebElement getEmpId() {
			return EmpId;
		}
		@FindBy(xpath="//*[@id=\"empsearch_supervisor_name\"]")
	    WebElement SupName;
		public WebElement getSupName() {
			return 	SupName;
		}
		@FindAll(@FindBy(id="//select[@id='empsearch_employee_status']"))
		WebElement dropDown;
		public Select getDropDown() {
			Select drop=new Select(dropDown); 
			return drop;
		}
		@FindBy(xpath="//option[contains(text(),'Full-Time Contract')]")
		List <WebElement> FullTimePermanent;
		 public  List <WebElement> getFullTimePermanent() {
			 return FullTimePermanent;
		 }
		@FindBy(id="empsearch_termination")
		WebElement CurrEmp;
		public WebElement getCurrEmp() {
			return CurrEmp;
		}
		@FindBy(id="empsearch_job_title")
		WebElement PIMJobTitle;
		public WebElement getPIMJobTitle() {
		return 	PIMJobTitle;
		}
		@FindBy(id="empsearch_sub_unit")
		WebElement SubUnit;
		public WebElement getSubUnit() {
			return 	SubUnit;
		}
		@FindBy(id="searchBtn")
		WebElement PIMSearchBtn;
		public WebElement getPIMSearchBtn() {
			return PIMSearchBtn;
		}
		@FindBy(id="menu_pim_addEmployee")
		WebElement AddEmp;
		public WebElement getAddEmp() {
			return AddEmp;
		}
		@FindBy(id="firstName")
		WebElement FNameTxtField;
		public WebElement getFNameTxtField() {
			return FNameTxtField;
		}
		@FindBy(id="middleName") 
		WebElement MNameTxtField;
		public WebElement getMNameTxtField() {
			return MNameTxtField;
		}
		@FindBy(id="lastName")
		WebElement LNameTxtField;
		public WebElement getLNameTxtField() {
			return LNameTxtField;
		}
		@FindBy(id="employeeId")
		WebElement EmpID;
		public WebElement getEmpID() {
			return EmpID;
		}
		@FindBy(id="chkLogin")
		WebElement RadioBtn;
		public WebElement getRadioBtn() {
			return RadioBtn;
		}
		@FindBy(id="user_name")
		WebElement UserName;
		public WebElement getUserName() {
			return UserName;
		}
		@FindBy(id="user_password")
		WebElement Password;
		public WebElement getPassword() {
			return Password;
		}
		@FindBy(id="re_password")
		WebElement CnfrmPwd;
		public WebElement getCnfrmPwd() {
			return CnfrmPwd;
		}
		@FindBy(id="status")
		WebElement DropDown;
		public Select getDropDown1() {
			Select drop=new Select(DropDown);
			return drop;
			
		}
		@FindBy(xpath="//*[@id=\"status\"]/option[1]")
				WebElement StatusTXtField;
		public Select getStatusTXtField() {
			Select Status=new Select(StatusTXtField);
			return Status;
		}
		
		@FindBy(id="btnSave")
		WebElement PIMSaveBtn;
		public WebElement getPIMSaveBtn() {
			return PIMSaveBtn;
		}
		@FindBy(id="photofile")
		WebElement ChsFile;
		public WebElement getChsFile() {
			return ChsFile;
		}
		
		@FindBy(name="btnAdd")
		WebElement PIMAddBtn;
		public WebElement getPIMAddBtn() {
			return	PIMAddBtn;
		}
		
		@FindBy(id="menu_buzz_viewBuzz")
		WebElement buzzButton;
		
		@FindBy(id="createPost_content")
		WebElement inputTextArea;
		
		@FindBy(id="postSubmitBtn")
		WebElement postStatsuBtn;
		
		@FindBy(id="img_upld_icon")
		WebElement uploadImagesBtn;
		
		@FindBy(id="phototext")
		WebElement photoTextField;
		
		@FindBy(id="image-upload-button")
		WebElement uploadlocalimg;
		
		@FindBy(xpath="//div[@id=\"postBody\"][1]/div[4]/div/a[2]")
		WebElement postLikeSymbol;
		
		@FindBy(xpath="//div[@id=\"postBody\"][1]/div[4]/div[2]/a[1]/img")
		WebElement postUnlikeSymbol;
		

		@FindBy(xpath="//*[@id=\"postBody\"][1]/div[9]/div/a/span")
		WebElement noOfLikes;

		@FindBy(xpath="//*[@id='postBody'][1]/div[9]/div[3]/a/span")
		WebElement noOfUnlikes;
		
		@FindBy(xpath="//*[@id='postBody'][1]/div[13]/div/form/textarea")
		WebElement commentSection;
		
		
		@FindBy(xpath="//div[@id=\"postBody\"][1]/div[4]/div[2]/a[2]/img")
		WebElement alreadyUnlikePresent;
		
		@FindBy(id="moreAniversary")
		WebElement moreAnniversaryBtn;
		
		@FindAll(@FindBy(xpath="//*[@id=\"upcomingAnnivList\"]/li/div[3]"))
		List<WebElement> birthdayDates;
		
		@FindAll(@FindBy(xpath="//*[@id=\"upcomingAnnivList\"]/li/div[1]/div[2]"))
		List<WebElement> birthdayNames;
		
		@FindBy(xpath="//*[@id=\"postBody\"]/div[1]/div[3]/div/div/a")
		WebElement postDropDown;
		
		@FindBy(xpath="//*[@class=\"submenu\"][1]/ul/li[2]/a")
		WebElement postDeleteBtn;
		
		@FindBy(xpath="//*[@class=\"submenu\"][1]/ul/li[1]/a")
		WebElement postEditBtn;
		
		@FindBy(xpath="//*[@id=\"delete_confirm\"][1]")
		WebElement confirmDeleteBtn;

		@FindBy(xpath="//*[@class=\"shareBox popupEdit shareEditText\"][1]")
		WebElement editPostTextArea;
		
		@FindBy(xpath="//*[@class=\"btnEditShare\"][1]")
		WebElement editPostSaveBtn;
		
		@FindBy(xpath="//*[@id=\"postBody\"]/div[5]/div")
		WebElement postText;
		
		@FindBy(xpath="//*[@id='postBody'][1]/div[13]/div/form/input[2]")
		WebElement postCmntBtn;

		public WebElement getCommentSection() {
			return commentSection;
		}

		public WebElement getNoOfUnlikes() {
			return noOfUnlikes;
		}
		
		public WebElement getNoOfLikes() {
			return noOfLikes;
		}

		public WebElement getPostUnlikeSymbol() {
			return postUnlikeSymbol;
		}
		
		public WebElement getPostLikeSymbol() {
			return postLikeSymbol;
		}
		
		public WebElement getUploadlocalimg() {
			return uploadlocalimg;
		}


		public WebElement getPhotoTextField() {
			return photoTextField;
		}


		public WebElement getUploadImagesBtn() {
			return uploadImagesBtn;
		}

		public WebElement getPostStatsuBtn() {
			return postStatsuBtn;
		}


		public WebElement getInputTextArea() {
			return inputTextArea;
		}

		public WebElement getBuzzButton() {
			return buzzButton;
		}
		

		public WebElement getPostText() {
			return postText;
		}
		
		public WebElement getPostCmntBtn() {
			return postCmntBtn;
		}

		public WebElement getEditPostSaveBtn() {
			return editPostSaveBtn;
		}

		public WebElement getEditPostTextArea() {
			return editPostTextArea;
		}

		public WebElement getConfirmDeleteBtn() {
			return confirmDeleteBtn;
		}

		public WebElement getPostDeleteBtn() {
			return postDeleteBtn;
		}

		public WebElement getPostEditBtn() {
			return postEditBtn;
		}

		public WebElement getPostDropDown() {
			return postDropDown;
		}

		public List<WebElement> getBirthdayNames() {
			return birthdayNames;
		}

		public List<WebElement> getBirthdayDates() {
			return birthdayDates;
		}

		public WebElement getMoreAnniversaryBtn() {
			return moreAnniversaryBtn;
		}

		public WebElement getAlreadyUnlikePresent() {
			return alreadyUnlikePresent;
		}
		
		public void setUploadImagesBtn(WebElement uploadImagesBtn) {
			this.uploadImagesBtn = uploadImagesBtn;
		}

		@FindBy(id="empPic")
		WebElement EmpPic;

		public WebElement getEmpPic() {
			return EmpPic;
		}

		@FindBy(id="photofile")
		WebElement Attach;

		public WebElement getAttach() {
			return Attach;
		}


		@FindBy(xpath="//*[@id=\"sidenav\"]/li[1]/a")
		WebElement Personaldetails;

		public WebElement getPersonaldetails() {
			return Personaldetails;
		}

		@FindBy(xpath="//*[@id=\"btnSave\"]")
		WebElement EditandSaveBtn;

		public WebElement getEditandSaveBtn() {
			return EditandSaveBtn;
		}
        

		@FindBy(id="btnAddContact") 
		WebElement AddContactBtn; 
				
		public WebElement getAddContactBtn() {
		return AddContactBtn;
		}
		
	   public OrangeHrmPages(WebDriver driver)
	  {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	  }
}
