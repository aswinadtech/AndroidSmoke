 package twc.Automation.SmokeTestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.TemporaryFilesystem;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;
import twc.Automation.Driver.Drivers;
import twc.Automation.General.DeviceStatus;
import twc.Automation.General.loginModule;
import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Automation.HandleWithApp.AppFunctions;
import twc.Automation.HandleWithAppium.AppiumFunctions;
import twc.Automation.HandleWithCharles.CharlesFunctions;
import twc.Automation.ReadDataFromFile.read_excel_data;
import twc.Automation.ReadDataFromFile.read_xml_data_into_buffer;
import twc.Automation.RetryAnalyzer.RetryAnalyzer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Title;
import twc.Automation.Driver.Drivers;
import twc.Automation.General.loginModule;
import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Automation.HandleWithApp.AppFunctions;
import twc.Automation.HandleWithAppium.AppiumFunctions;
import twc.Automation.HandleWithCharles.CharlesFunctions;
import twc.Automation.RetryAnalyzer.RetryAnalyzer;
import twc.Automation.General.Functions;





public class smokeTestCases extends Drivers {
	protected String email;
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	public int age;

	/*@Test
	public static void Scroll() throws Exception{
		for(int scroll=1;scroll<=250;scroll++){
			System.out.println("times ="  +scroll);
			for(int i=1;i<=10 ;i++){
				//System.out.println("times" +i);
				Thread.sleep(2000);
				AppFunctions.Swipe();
				Thread.sleep(2000);
			}

			AppiumFunctions.Kill_launch();
		}
		CharlesFunctions.ExportSession();

	}*/

	//Validate BB on Severe1
	/*@Test(priority=1,enabled = true,retryAnalyzer=RetryAnalyzer.class)
		@Title("Content Mode Severe1")
		public void Smoke_Test_Case_Content_Mode_Severe1() throws Exception{
			System.out.println("================= Content Mode Severe1 Test Case Started =========================");
			AppiumFunctions.Kill_launch();
			MapLocalFunctions.contentModeModule("severe1");
			CharlesFunctions.charlesOpen();
			CharlesFunctions.browserForMapLocal();
			CharlesFunctions.ClearSessions();
			AppiumFunctions.Kill_launch();
			CharlesFunctions.ExportSession();
			Functions.maplocal_bbcall_validation("MapLocal","severe1");
			System.out.println("================= Content Mode Severe1 Test Case End =========================");
		}*/

	//Valodate BB on Severe2
	/*@Test(priority=2,enabled = true,retryAnalyzer=RetryAnalyzer.class)
		@Title("Content Mode Severe2")
		public void Smoke_Test_Case_Content_Mode_Severe2() throws Exception{
			System.out.println("================= Content Mode Severe2 Test Case Started =========================");

			MapLocalFunctions.contentModeModule("severe2");
			//AppiumFunctions.UnInstallApp(); //added this
			AppiumFunctions.Kill_launch();
//			AppiumFunctions.Kill_launch();
			CharlesFunctions.ClearSessions();
			//AppiumFunctions.Kill_launch();
			AppiumFunctions.Kill_launch();; //added this
			CharlesFunctions.ExportSession();
			Functions.maplocal_bbcall_validation("MapLocal","severe2");
			System.out.println("================= Content Mode Severe2 Test Case End =========================");
		}*/

	//CXTG Values Test Case 
	/*@Title("Verify WeatherFx API Call Response When User Selects Contextual Locations")
	@Test(priority=3,enabled = true,retryAnalyzer=RetryAnalyzer.class)
	public void
	Smoke_Test_Case_C415129_Verify_Weatherfx_API_Call_Response_When_User_Selects_Contextual_Locations()
			throws Exception{
      	System.out.println("================= WFXTG Test Case Started =========================");
		MapLocalFunctions.contentModeModule("normal");
		CharlesFunctions.startSessionBrowserData();
		//AppiumFunctions.LaunchAppWithFullReset("false");
		//AppFunctions.compareBuildVersion();//commeneted dec 9
		//AppiumFunctions.Kill_launch();
		//AppiumFunctions.Swipe_Up();
		//loginModule.login();
		//AppFunctions.Kill_Launch_App();
		//Functions.verifySavedAddressList(1);
		CharlesFunctions.StopExportSessionXMLFile();
		Functions.validate_CXTG_values1("WFXTrigger");
		System.out.println("================= WFXTG Test Case End =========================");
	}*/

	// Wfxtg Values Test Case 
/*	@Test(priority=4,enabled = true,retryAnalyzer=RetryAnalyzer.class)
	@Title("Verify WeatherFX API Request For Wfxtg Value")
	public void
	Smoke_Test_Case_C333173_Verify_WeatherFX_API_Request_For_Wfxtg_Value()
			throws Exception{
		System.out.println("================= Wfxtg Values Test Case Started =========================");

		if(RetryAnalyzer.count >= 1){
		
		Functions.validate_CXTG_values2("WFXTrigger");
	}else{
		Functions.validate_CXTG_values2("WFXTrigger");
		}

		System.out.println("================= Wfxtg Values Test Case End =========================");
	}*/


	// Factual Call Test Case 
	/*@Test(priority=5,enabled = true,retryAnalyzer=RetryAnalyzer.class)
	@Title("Verify Factual Call")
	public void Smoke_Test_Case_C333174_Verify_Factual_Call() throws
	Exception{
		System.out.println("================= Factual Call Test Case Started =========================");
		Functions.validate_CXTG_values2("WFXTrigger");
		System.out.println("================= Factual Call Test Case End =========================");
	}*/


	//Lotame Call Test Case 
	/*@Test(priority=6,enabled = true,retryAnalyzer=RetryAnalyzer.class)
	@Title("Verify Lotame Call")
	public void Smoke_Test_Case_C333182_Verify_Lotame_Call() throws
	Exception{
		System.out.println("================= Lotame Call Test Case Started =========================");
		Functions.validate_CXTG_values3("WFXTrigger");		
		System.out.println("================= Lotame Call Test Case End =========================");
	}

	// Pull To Refresh Test Case 
	@Test(priority=7,enabled = true)
	@Title("Verify Ad Call Is Made On Pull To Refresh")
	public void
	Smoke_Test_Case_C333179_Verify_Ad_Call_Is_Made_On_Pull_To_Refresh()
			throws Exception{
		System.out.println("================= Pull To Refresh Test Case Started =========================");
		CharlesFunctions.startSessionBrowserData();
		AppiumFunctions.Kill_launch();
		AppFunctions.Pull_To_Refresh("Pulltorefresh");
		CharlesFunctions.StopExportSessionXMLFile();
		Functions.bb_call_validation("Pulltorefresh");

		System.out.println("================= Pull To Refresh Test Case  End =========================");
	}


	//ApiumFunctions.LaunchAppWithFullReset(); Launch Test Case 
	@Test(priority=8,enabled = true)
	@Title("Verify Ad Calls On Clean Launch")
	public void Smoke_Test_Case_C333172_Verify_Ad_Calls_On_Clean_Launch()
			throws Exception{
		System.out.println("================= Clean App Launch Test Case Started =========================");
		CharlesFunctions.startSessionBrowserData();
		//AppiumFunctions.Kill_launch();
		AppiumFunctions.Kill_launch();
		AppFunctions.CleanLaunch_launch("General");
		CharlesFunctions.ExportSession();
		Functions.clean_App_Launch("CleanLaunch");
		System.out.println("================= Clean App Launch Test Case End =========================");
	}
	//Lotame Call Test Case 
		@Test(priority=9,enabled = true)
		@Title("Verify Bcp Call")
		public void Verify_Bcp_Call() throws
		Exception{
			System.out.println("================= Bcp Call Test Case Started =========================");

			Functions.validate_CXTG_values4("WFXTrigger");		
			System.out.println("================= Bcp Call Test Case End =========================");
		}*/
//
//
	
	


	
	

	




	

	//Hourly Module Extended Page Ad Test Case
	/*@Test(priority=1,enabled = true)
	@Title("Verify Ad Is Present On Extended Hourly Page")
	public void Smoke_Test_Case_C333175_Verifyd_Ad_Is_Present_On_Extended_Hourly_Page()
			throws Exception {
		System.out.println("================= Hourly Module Test Case Started =========================");
		AppiumFunctions.Kill_launch();
		AppiumFunctions.Kill_launch();
		AppFunctions.AddingLocation();
		CharlesFunctions.ClearSessions();
		AppFunctions.verify_adpresent_onHourly_page("Hourly");
	    CharlesFunctions.ExportSession();
		Functions.get_wfxtriggers_call2("WFXTrigger");
		AppFunctions.click_HomeButton();
		System.out.println("================= Hourly Module Test Case End =========================");
	}
	//Daily Module Extended Page Ad Test Case
	@Test(priority=2,enabled = true)
	@Title("Verify Ad Is Present On Extended Daily Page")
	public void
	Smoke_Test_Case_C333180_Verify_Ad_Is_Present_On_Extended_Daily_Page()
			throws Exception {
		System.out.println("================= Daily Module Test Case Started =========================");
		CharlesFunctions.ClearSessions();
		AppFunctions.verify_adpresent_onToday_page();
		CharlesFunctions.ExportSession();
		Functions.finding_Dailycall("WFXTrigger");
		AppFunctions.click_HomeButton();
		
		System.out.println("================= Daily Module Test Case End =========================");
	}
	//Today Module Extended Maps Page Ad Test Case
	@Test(priority=3,enabled = true)
	@Title("Verify Ad Is Present On Extended Radr Page")
	public void Smoke_Test_Case_C333180_Verify_Ad_Is_Present_On_RadarPage()    throws Exception {
		System.out.println("================= Radar Module Test Case Started =========================");
		CharlesFunctions.ClearSessions();
		AppFunctions.verify_adpresent_onRadar_page("Daily");
		CharlesFunctions.ExportSession();
		Functions.finding_Mapcall("Daily");
		AppFunctions.click_HomeButton();
		System.out.println("================= Radar Module Test Case End =========================");
	}

	@Test(priority=4,enabled = true)
	@Title("Verify Ad Is Present On Extended Video Page")
	public void Smoke_Test_Case_C333175_Verify_Ad_Is_Present_On_Extended_Video_Page()
			throws Exception {
		System.out.println("================= Video Module Test Case Started =========================");
		CharlesFunctions.ClearSessions();
		AppFunctions.verify_adpresent_onvideo_page("Daily");
		CharlesFunctions.ExportSession();
		Functions.finding_Videocall("Daily");	
		AppFunctions.click_HomeButton();
		System.out.println("================= Video Module Test Case End =========================");
	}
	@Test(priority=1,enabled = true)
	@Title("Verify Ad Is Present On Extended Hourly tile Page")
	public void Verify_Ad_Is_Present_On_Extended_HourlyTile_Page()
			throws Exception {
		System.out.println("================= Video Module Test Case Started =========================");
		CharlesFunctions.ClearSessions();
		AppFunctions.verify_adpresent_onvideo_page("Daily");
		CharlesFunctions.ExportSession();
		Functions.finding_Videocall("Daily");	
		AppFunctions.click_HomeButton();
		System.out.println("================= Video Module Test Case End =========================");
	}
	    
	// Verify the home screen ads  and ad calls for  Native BB and Native Animated BB  
		@Test(priority=1,enabled = true,retryAnalyzer=RetryAnalyzer.class)
			@Title("Verify home screen ads  and ad calls")
			public void Smoke_Test_Case_homescreenadsandadcalls()
					throws Exception{
				System.out.println("================= Verify home screen ads  and ad calls for  Native BB  Test Case Started =========================");
				AppiumFunctions.LaunchApp();
				CharlesFunctions.startSessionBrowserData();
				CharlesFunctions.ClearSessions();
				System.out.println("================= Verify home screen ads  and ad calls for  Native BB  Test Case End =========================");
			}
		//Verify Today tile iu call value is generated or not
				@Test(priority=200,enabled = true)
				@Title("Verify Today tile iu call value is generated or not")
				public void Smoke_Test_CaseVerify_Hourlytileiucallvalue()
						throws Exception {
					System.out.println("================= Today Tile Test Case Started =========================");
				
					Functions.get_tileadcalls_hourly();
					System.out.println("================= Today Tile Test Case End =========================");
				}
				@Test(priority=3,enabled = true)
				@Title("Verify Today tile iu call value is generated or not")
				public void Smoke_Test_CaseVerify_Dailytileiucallvalue()
						throws Exception {
					System.out.println("================= Today Tile Test Case Started =========================");
				
					Functions.get_tileadcalls_daily();
					System.out.println("================= Today Tile Test Case End =========================");
				}
				
				
				
				
	
	@Test(priority=1,enabled = true)
	@Title("Verifying iu value for maps card")
	public void Smoke_Test_CaseVerify_mapscard_iu()
			throws Exception {
		System.out.println("================= verifying iu value for the maps card started =========================");
		AppFunctions.Swipeapptillend();
		CharlesFunctions.ExportSessions();
		Functions.finding_maps_cardvalue();
     	System.out.println("================= verifying iu value for the maps card End =========================");
	}	
	/*@Test(priority=2,enabled = true)
	@Title("Verifying iu value for health and activities card")
	public void Smoke_Test_CaseVerify_health_and_activities_card2_iu()
			throws Exception {
		System.out.println("================= verifying iu value for health_and_activitiescard_iu started =========================");
		Functions.finding_health_activities_card_iu_value();
     	System.out.println("================= verifying iu value for health_and_activitiescard__iu End =========================");
	}*/
	/*@Test(priority=2,enabled = true)
	@Title("Verifying Lotame bcp.crwdcntrl.net url")
	public void Smoke_TestCaseVerify_bcpcrwdcntrlnet_url()
			throws Exception {
		System.out.println("================= Verifying Lotame bcpcrwdcntrlnet url started =========================");
		Functions.validating_bcp();
     	System.out.println("================= Verifying Lotame bcpcrwdcntrlnet url End =========================");
	}
	@Test(priority=1,enabled = true)
	@Title("Verifying Lotame ad.crwdcntrl.net url")
	public void Smoke_Test_CaseVerify_adcrwdcntrlnet_url()
			throws Exception {
		System.out.println("================= Verifying Lotame ad.crwdcntrl.net url started =========================");
		CharlesFunctions.startSessionBrowserData();
		CharlesFunctions.ExportSession();
		Functions.validating_adcrw();
     	System.out.println("================= Verifying Lotame ad.crwdcntrl.net url End =========================");
	}
	@Test(priority=2,enabled = true)
	@Title("Verifying wfxtg triggere call url")
	public void Smoke_Test_CaseVerify_WeatherFXAPI_url()
			throws Exception {
		System.out.println("================= Verifying WeatherFX API url started =========================");
		Functions.validating_WeatherFXAPI();
     	System.out.println("================= Verifying WeatherFX API url End =========================");
	}*/
	/*@Test(priority=4,enabled = true)
	@Title("Verifying Lotame ad.crwdcntrl.net url")
	public void Smoke_Test_CaseVerify_WeatherFX_url()
			throws Exception {
		System.out.println("================= Verifying WeatherFX API url started =========================");
		Functions.validating_WeatherFXAPI();
     	System.out.println("================= Verifying WeatherFX API url End =========================");
	}*/
	/*@Test(priority=3,enabled = true)
	@Title("Verifying Fatual location url")
	public void Smoke_Test_CaseVerify_Fatual_url()
			throws Exception {
		System.out.println("================= Verifying Fatual url started =========================");
		Functions.validating_Fatual();
     	System.out.println("================= Verifying Fatual API url End =========================");
	}*/
/*	@Test(priority=100,enabled = true)
	@Title("Verifying Lotame ad.crwdcntrl.net url")
	public void Smoke_TestCasePulltoRefresh()
			throws Exception {
		System.out.println("================= Verifying Home screen ad call while pull to refresh started =========================");
     CharlesFunctions.clearSessionBrowserData();
		CharlesFunctions.startSessionBrowserData();
		AppFunctions.Kill_Launch_App();
        AppiumFunctions.ClickonIUnderstand();
		AppFunctions.Pull_To_Refresh("Pulltorefresh");
		CharlesFunctions.ExportSession();
		Functions.finding_Homescreen_iu_value();
     	System.out.println("=================Verifying Home screen ad call while pull to refresh End =========================");
	}
	@Test(priority=5,enabled = true)
	@Title("Verifying iu value for Home screen")
	public void Smoke_Test_CaseVerify_Homescreen_ad_iu()
			throws Exception {
		System.out.println("================= verifying iu value for health_and_activitiescard_iu started =========================");
		Functions.finding_Homescreen_iu_value();
     	System.out.println("================= verifying iu value for health_and_activitiescard__iu End =========================");
	}
	@Test(priority=6,enabled = true)
	@Title("Verifying iu value for Video ")
	public void Smoke_Test_CaseVerify_Vidoe_ad_iu()
			throws Exception {
		System.out.println("================= verifying iu value for  Video ad call iu started =========================");
		Functions.finding_VideoCard_iu_value();
     	System.out.println("================= verifying iu value for  Video ad call iu End =========================");
	}
	@Test(priority=7,enabled = true)
	@Title("Verifying iu value for Radar&Maps ")
	public void Smoke_Test_CaseVerify_Radar_Map_card_iu()
			throws Exception {
		System.out.println("================= verifying iu value for Radar_Map_card started =========================");
		Functions.finding_Radar_Map_card_iu_value();
     	System.out.println("================= verifying iu value for Radar_Map_card End =========================");
	}
	@Test(priority=8,enabled = true)
	@Title("Verifying iu value Today details Page ")
	public void Smoke_Test_CaseVerify_Today_details_page_iu()
			throws Exception {
		System.out.println("================= verifying iu value for Today_details_page_iu started =========================");
		Functions.finding_Today_detail_page_iu_value();
     	System.out.println("================= verifying iu value for Today_details_page_iu End =========================");
	}
	@Test(priority=9,enabled = true)
	@Title("Verifying iu value for health and activities Running Spot light ad call iu")
	public void Smoke_Test_Verify_health_and_activities_Running_spotlight_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_Running_spotlight_adcall_iu Started =========================");
		Functions. health_and_activities_Running_spotlight_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_Running_spotlight_adcall_iu End =========================");
	}
	@Test(priority=10,enabled = true)
	@Title("Verifying iu value for health and activities Bot&beach Spotlight ad call iu")
	public void Smoke_Test_Verify_health_and_activities_Bot_beach_detailpage_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_Bot&beach_Spotlight_adcall_iu Started =========================");
		Functions.health_and_activities_Boat_beach_detailpage_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_Bot&beach_Spotlight_adcall_iu End =========================");
	}
	@Test(priority=11,enabled = true)
	@Title("Verifying iu value for health and activities Allergy Spot light ad call iu")
	public void Smoke_Test_Verify_health_and_activities_Allergy_detailpage_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_Allergy_Spotlight_adcall_iu Started =========================");
		Functions.health_and_activities_Allergy_detailpage_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_Allergy_Spotlight_adcall_iu End =========================");
	}
	@Test(priority=12,enabled = true)
	@Title("Verifying iu value for health and activities cold&Flu Spotlight ad call iu")
	public void Smoke_Test_Verify_health_and_activities_cold_flu_Spotlight_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_cold_flu_Spotlight_adcall_iu Started =========================");
		Functions.health_and_activities_Cold_Flu_detailpage_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_cold_flu_Spotlight_adcall_iu End =========================");
	}
	@Test(priority=13,enabled = true)
	@Title("Verifying iu value for health and activities Air Quality detailpage ad call iu")
	public void Smoke_Test_Verify_health_and_activities_Air_Quality_detailpage_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_AirQuality_detailpage_adcall_iu Started =========================");
		Functions.health_and_activities_AirQuality_detailpage_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_AirQuality_detailpage_adcall_iu End =========================");
	}
	@Test(priority=14,enabled = true)
	@Title("Verifying iu value Hurricane detailpage ad call iu")
	public void Smoke_Test_Verify_Hurricane_detailpage_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_Hurricane_detailpage_adcall_iu Started =========================");
		Functions.Verify_Hurricane_detailpage_adcall_iu();
     	System.out.println("================= Verify_Hurricane_detailpage_adcall_iu End =========================");
	}
	
	@Test(priority=15,enabled = true)
	@Title("Verifying iu value for news detailpage ad call iu")
	public void Smoke_Test_Verify_News_detailpage_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_News_detailpage_adcall_iu Started =========================");
		Functions.Verify_News_detailpage_adcall_iu();
     	System.out.println("================= Verify_News_detailpage_adcall_iu End =========================");
	}
	@Test(priority=16,enabled = true)
	@Title("Verifying iu value for daily card ad call iu")
	public void Smoke_Test_Verify_daily_card_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_News_detailpage_adcall_iu Started =========================");
		Functions. Verify_dailycard_iu();
     	System.out.println("================= Verify_daily_card_adcall_iu End =========================");
	}
	@Test(priority=105,enabled = true)
	@Title("Verifying iu value for snapshot ad call iu")
	public void Smoke_Test_Verify_snapshotcard_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_snapshotcard_adcall_iu Started =========================");
		CharlesFunctions.ClearSessions();
		CharlesFunctions.startSessionBrowserData();
		AppiumFunctions.click_snapShot_button();
		CharlesFunctions.ExportSession();
		Functions.Verify_snapshot_spotlight_adcard_iu();
     	System.out.println("================= Verify_snapshotcard_adcall_iu End =========================");
	}
	@Test(priority=104,enabled = true)
	@Title("Verifying iu value for snapshot ad call iu")
	public void Smoke_Test_Verify_snapshot_spotlight_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_snapshot_spotlight_adcall_iu Started =========================");
		Functions.Verify_snapshot_spotlight_iu();
     	System.out.println("================= Verify_snapshot_spotlight_adcall_iu End =========================");
	}*/
	
	@Test(priority=1,enabled = true)
	@Title("Verifying amazon aax home screen today preload ad call")
	public void Smoke_Test_amazon_aax_home_screen_today_preload_adcall__iu()
			throws Exception {
		System.out.println("================= Verify amazon aax home screentoday preload adcall Started =========================");
		//AppFunctions.Pull_To_Refresh("Pulltorefresh");
		CharlesFunctions.startSessionBrowserData();
		CharlesFunctions.ExportSession();
		Functions. get_aaxcal_homescreen_today();		
     	System.out.println("================= Verify amazon aax home screentoday preload adcall End =========================");
	}
	@Test(priority=2,enabled = true)
	@Title("Verifying amazon aax home screen today preload ad call")
	public void Smoke_Test_amazon_aax_rader_card_preload_adcall()
			throws Exception {
		System.out.println("================= Verify amazon aax radar card preload adcall Started =========================");		
		Functions.get_aaxcal_radar();
     	System.out.println("================= Verify amazon aax radar card preload adcall End =========================");
	}
	@Test(priority=3,enabled = true)
	@Title("Verifying amazon aax Air Quality preload ad call")
	public void Smoke_Test_amazon_aax_AQ_card_preload_adcall()
			throws Exception {
		System.out.println("================= Verify amazon aax AQ card preload adcall Started =========================");		
		Functions.get_aaxcal_AirQuality();
     	System.out.println("================= Verify amazon aax AQ card preload adcall End =========================");
	}
	@Test(priority=4,enabled = true)
	@Title("Verifying amazon aax Hourly  preload ad call")
	public void Smoke_Test_amazon_aax_Hourly_preload_adcall()
			throws Exception {
		System.out.println("================= Verify amazon aax Hourly card preload adcall Started =========================");		
		Functions.get_aaxcal_Hourly();
     	System.out.println("================= Verify amazon aax Hourly card preload adcall End =========================");
	}
	@Test(priority=5,enabled = true)
	@Title("Verifying amazon aax daily preload ad call")
	public void Smoke_Test_amazon_aax_Daily_preload_adcall()
			throws Exception {
		System.out.println("================= Verify amazon aax Daily card preload adcall Started =========================");		
		Functions.get_aaxcal_Daily();
     	System.out.println("================= Verify amazon aax Daily card preload adcall End =========================");
	}
	
	@Test(priority=6,enabled = true)
	@Title("Verifying amazon aax maps preload ad call")
	public void Smoke_Test_amazon_aax_mapsdetails_preload_adcall()
			throws Exception {
		System.out.println("================= Verify amazon aax Maps card preload adcall Started =========================");		
		Functions.get_aaxcal_map_details();
     	System.out.println("================= Verify amazon aax Maps card preload adcall End =========================");
	}
	@Test(priority=7,enabled = true)
	@Title("Verifying iu value for Home screen")
	public void Smoke_Test_CaseVerify_Homescreen_ad_iu()
			throws Exception {
		System.out.println("================= verifying iu value for health_and_activitiescard_iu started =========================");
		Functions.finding_Homescreen_iu_value();
     	System.out.println("================= verifying iu value for health_and_activitiescard__iu End =========================");
	}
	@Test(priority=8,enabled = true)
	@Title("Verifying wfxtg triggere call url")
	public void Smoke_Test_CaseVerify_WeatherFXAPI_url()
			throws Exception {
		System.out.println("================= Verifying WeatherFX API url started =========================");
		Functions.validating_WeatherFXAPI();
     	System.out.println("================= Verifying WeatherFX API url End =========================");
	}
	@Test(priority=9,enabled = true)
	@Title("Verifying api weather call url")
	public void Smoke_Test_CaseVerify_turbo_url()
			throws Exception {
		System.out.println("================= Verifying Turbo call  API url started =========================");
		Functions.validating_turbocallAPI();
     	System.out.println("================= Verifying Turbo call API url End =========================");
	}
	
	@Test(priority=10,enabled = true)
	@Title("Verifying Lotame ad.crwdcntrl.net url")
	public void Smoke_Test_CaseVerify_adcrwdcntrlnet_url()
			throws Exception {
		System.out.println("================= Verifying Lotame ad.crwdcntrl.net url started =========================");
		Functions.validating_adcrw();
     	System.out.println("================= Verifying Lotame ad.crwdcntrl.net url End =========================");
	}
		
	@Test(priority=11,enabled = true)
	@Title("Verifying Video ad call")
	public void Smoke_Test_Case_Verify_Video_adCalll()
			throws Exception {
		System.out.println("================= Verifying Video ad call testcase  started =========================");
		CharlesFunctions.clearSessionBrowserData();
		CharlesFunctions.startSessionBrowserData();
		 AppiumFunctions.clickOnUnderstandbutton();
		   // AppFunctions.Kill_Launch_App();
		    AppiumFunctions.Kill_launch();	
		    AppiumFunctions.clickOnUnderstandbutton();
		    //AppiumFunctions.Kill_launch();
		    Thread.sleep(10000);
                    AppiumFunctions.SwipeUp_Counter(3);
		     AppiumFunctions.click_hurricane_element();	
			AppiumFunctions.clickOnBackArrowElement();
                     AppiumFunctions.SwipeUp_Counter(1);
		    AppiumFunctions.clickOnRadarMaps();
			AppiumFunctions.clickOnBackArrowElement();
                     AppiumFunctions.SwipeUp_Counter(1);
			AppiumFunctions.click_Todaydetails_element();
			AppiumFunctions.clickOnBackArrowElement();
		    AppiumFunctions.SwipeUp_Counter(1);
		    AppiumFunctions.clickOnVideoElement();
			AppiumFunctions.clickOnBackArrowElement();
                         AppiumFunctions.SwipeUp_Counter(1);
			//AppiumFunctions.click_Boat_Beach_element();
			//AppiumFunctions.clickOnBackArrowElement();
			AppiumFunctions.click_Running_element();
			AppiumFunctions.clickOnBackArrowElement();
			AppiumFunctions.click_cold_Flu_element();
			AppiumFunctions.clickOnBackArrowElement();
			AppiumFunctions.click_Allergy_element();
			AppiumFunctions.clickOnBackArrowElement();
			AppiumFunctions.SwipeUp_Counter(2);
			AppiumFunctions.click_Airpollution_element();
			AppiumFunctions.clickOnBackArrowElement();
			AppiumFunctions.SwipeUp_Counter(1);
			AppiumFunctions.click_news_element();
			AppiumFunctions.clickOnBackArrowElement();
			AppiumFunctions.click_hourly_element();
			CharlesFunctions.ExportSession();
			Functions.finding_VideoCard_iu_value();	
     	System.out.println("================= Verifying Video ad call testcase End =========================");
	}
	
	@Test(priority=12,enabled = true)
	@Title("Verifying iu value for Radar&Maps feed card ")
	public void Smoke_Test_CaseVerify_Radar_Maps_feedcard_adcall()
			throws Exception {
		System.out.println("================= verifying iu value for Radar&Maps feed card started =========================");
		Functions.finding_Radar_Map_feedcard_iu_value();
     	System.out.println("================= verifying iu value for Radar&Maps feed card  End =========================");
	}
		
	@Test(priority=13,enabled = true)
	@Title("Verifying iu value for Radar&Maps details card")
	public void Smoke_Test_CaseVerify_Radar_Maps_deatailscard_adcall()
			throws Exception {
		System.out.println("================= verifying iu value for Radar&Maps deatail card started =========================");
		Functions.finding_Radar_Map_card_iu_value();
     	System.out.println("================= verifying iu value for Radar&Maps deatail card  End =========================");
	}
	
	/*@Test(priority=14,enabled = true)
	@Title("Verifying iu value Today details Page ")
	public void Smoke_Test_CaseVerify_Today_details_page_iu()
			throws Exception {
		System.out.println("================= verifying iu value for Today_details_page_iu started =========================");
		Functions.finding_Today_detail_page_iu_value();
     	System.out.println("================= verifying iu value for Today_details_page_iu End =========================");
	}*/
	
@Test(priority=15,enabled = true)
	@Title("Verifying amazon aax for today details card")
	public void Smoke_Test_amazon_aax_today_deatailcard()
			throws Exception {
		System.out.println("================= Verify amazon aax for today detail adcard Started =========================");		
		Functions.get_aaxcal_today_details();
		System.out.println("================= Verify amazon aax for today detail adcard End=========================");		
	}
	@Test(priority=16,enabled = true)
	@Title("Verifying iu value Health&Activities feed card ")
	public void Smoke_Test_CaseVerify_Health_Activities_feed_adcall()
			throws Exception {
		System.out.println("================= verifying iu value Health&Activities feed card started =========================");
		Functions.finding_H_C_adcalL_iu();
     	System.out.println("================= verifying iu value Health&Activities feed card End =========================");
	}
	@Test(priority=17,enabled = true)
	public void Smoke_Test_Verify_health_and_activities_Running_spotlight_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_Running_spotlight_adcall_iu Started =========================");
		Functions. health_and_activities_Running_spotlight_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_Running_spotlight_adcall_iu End =========================");
	}
	@Test(priority=18,enabled = true)
	@Title("Verifying iu value for health and activities Bot&beach Spotlight ad call iu")
	public void Smoke_Test_Verify_health_and_activities_Bot_beach_detailpage_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_Bot&beach_Spotlight_adcall_iu Started =========================");
		Functions.health_and_activities_Boat_beach_detailpage_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_Bot&beach_Spotlight_adcall_iu End =========================");
	}
	@Test(priority=19,enabled = true)
	@Title("Verifying iu value for health and activities Allergy Spot light ad call iu")
	public void Smoke_Test_Verify_health_and_activities_Allergy_detailpage_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_Allergy_Spotlight_adcall_iu Started =========================");
		Functions.health_and_activities_Allergy_detailpage_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_Allergy_Spotlight_adcall_iu End =========================");
	}
	@Test(priority=20,enabled = true)
	@Title("Verifying iu value for health and activities cold&Flu Spotlight ad call iu")
	public void Smoke_Test_Verify_health_and_activities_cold_flu_Spotlight_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_cold_flu_Spotlight_adcall_iu Started =========================");
		Functions.health_and_activities_Cold_Flu_detailpage_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_cold_flu_Spotlight_adcall_iu End =========================");
	}	
	/*@Test(priority=21,enabled = true)
	@Title("Verifying amazon axx slot for cold&flu Bigbanner ad")
	public void Smoke_Test_Verify_amazon_aax_cold_flu_Bigbanner_ad()
			throws Exception {
		System.out.println("================= verifying amazon aax slot for cold&flu BigBanner adcall started =========================");
		Functions.get_aaxcal_Cold_Flu_Bigbanner();
     	System.out.println("================= verifying amazon aax slot for cold&flu BigBanner adcall  End =========================");
	}
	@Test(priority=22,enabled = true)
	@Title("Verifying amazon axx slot for Allergy Bigbanner ad")
	public void Smoke_Test_Verify_amazon_aax_Allergy_Bigbanner_ad()
			throws Exception {
		System.out.println("================= verifying amazon aax slot for Allergy BigBanner adcall started =========================");
		Functions.get_aaxcal_Allergy_Bigbanner();
     	System.out.println("================= verifying amazon aax slot for Allergy BigBanner adcall  End =========================");
	}*/
	@Test(priority=23,enabled = true)
	@Title("Verifying amazon axx slot for Running Bigbanner ad")
	public void Smoke_Test_Verify_amazon_aax_Running_Bigbanner_ad()
			throws Exception {
		System.out.println("================= verifying amazon aax slot for Running BigBanner adcall started =========================");
		Functions.get_aaxcal_Running_Bigbanner();
     	System.out.println("================= verifying amazon aax slot for Running BigBanner adcall  End =========================");
	}
	/*@Test(priority=24,enabled = true)			
	@Title("Verifying amazon axx slot for Boat&Beach Bigbanner ad")
	public void Smoke_Test_Verify_amazon_aax_Boat_Beach_Bigbanner_ad()
			throws Exception {
		System.out.println("================= verifying amazon aax slot for Boat&Beach BigBanner adcall started =========================");
		Functions.get_aaxcal_Boat_Beach_Bigbanner();
     	System.out.println("================= verifying amazon aax slot for Boat&Beach BigBanner adcall  End =========================");
	}*/
	@Test(priority=25,enabled = true)
	@Title("Verifying iu value seasonal hub  feed card ")
	public void Smoke_Test_CaseVerify_seasonalhub_feed_adcall()
			throws Exception {
		System.out.println("================= verifying iu value SeasonalHub feed card started =========================");
		Functions.finding_Seasonalhub_adcalL_iu();
     	System.out.println("================= verifying iu value SeasonalHub feed card End =========================");
	}
	@Test(priority=26,enabled = true)
	@Title("Verifying iu value for  Air Quality detailpage ad call iu")
	public void Smoke_Test_Verify_health_and_activities_Air_Quality_detailpage_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_health_and_activities_AirQuality_detailpage_adcall_iu Started =========================");
		Functions.health_and_activities_AirQuality_detailpage_adcall_iu();
     	System.out.println("================= Verify_health_and_activities_AirQuality_detailpage_adcall_iu End =========================");
	}
	/*@Test(priority=27,enabled = true)			
	@Title("Verifying amazon axx slot for Boat&Beach Bigbanner ad")
	public void Smoke_Test_Verify_amazon_aax_AirQuality_adcall()
			throws Exception {
		System.out.println("================= verifying amazon aax slot for Boat&Beach BigBanner adcall started =========================");
		Functions.get_aaxcal_AQ();	
     	System.out.println("================= verifying amazon aax slot for Boat&Beach BigBanner adcall  End =========================");
	}*/
	@Test(priority=28,enabled = true)
	@Title("Verifying iu value for news detailpage ad call iu")
	public void Smoke_Test_Verify_News_detailpage_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_News_detailpage_adcall_iu Started =========================");
		Functions.Verify_News_detailpage_adcall_iu();
     	System.out.println("================= Verify_News_detailpage_adcall_iu End =========================");	
     	}
@Test(priority=29,enabled = true)
@Title("Verifying iu value for news detailpage ad call iu")
public void Smoke_Test_Verify_News_hurricane_detail_adcall_iu()
		throws Exception {
	System.out.println("================= Verify_hurricane_detailpage_adcall_iu Started =========================");
	Functions.Verify_Hurricane_detailpage_adcall_iu();
 	System.out.println("================= Verify_hurricane_detailpage_adcall_iu End =========================");
}
	/*@Test(priority=29,enabled = true)			
	@Title("Verifying amazon axx slot for Boat&Beach Bigbanner ad")
	public void Smoke_Test_Verify_amazon_aax_News_adcall()
			throws Exception {
		System.out.println("================= verifying amazon aax slot for news adcall started =========================");
		Functions.get_aaxcal_news();	
     	System.out.println("================= verifying amazon aax slot for Boat&Beach BigBanner adcall  End =========================");
	}*/
	@Test(priority=30,enabled = true)
	@Title("Verifying iu value for daily card ad call iu")
	public void Smoke_Test_Verify_daily_card_adcall_iu()
			throws Exception {
		System.out.println("================= Verifyig daily adcall_iu Started =========================");
		Functions. Verify_dailycard_iu();
     	System.out.println("================= Verify_daily_card_adcall_iu End =========================");
	}

@Test(priority=31,enabled = true)
@Title("Verifying AQ aax call")
public void Smoke_Test_CaseVerify_AQ_aax_amazon_adcalll()
		throws Exception {
	System.out.println("================= Verifying amazon AQ aax call  started =========================");
	Functions.get_aaxcal_AQ();
 	System.out.println("================= Verifying amazon AQ aax call End =========================");
}
	
@Test(priority=32,enabled = true)
@Title("Verifying news aax call")
public void Smoke_Test_CaseVerify_news_aax_amazon_adcalll()
		throws Exception {
	System.out.println("================= Verifying amazon news aax call  started =========================");
	Functions.get_aaxcal_news();
 	System.out.println("================= Verifying amazon news aax call End =========================");
}


@Test(priority=33,enabled = true)
@Title("Verifying ysoriu value for news detailpage ad call iu")
public void Smoke_Test_Verify_hourly_detailpage_adcall_iu()
		throws Exception {
	System.out.println("================= Verify_hourly_detailpage_adcall_iu Started =========================");
	Functions.Verify_hourly_detailpage_adcall_iu();
 	System.out.println("================= Verify_hourly_detailpage_adcall_iu End =========================");	
 	}
@Test(priority=34,enabled = true)
@Title("Verifying news aax call")
public void Smoke_Test_CaseVerify_hurricane_detal_aax_adcalll()
		throws Exception {
	System.out.println("================= Verifying amazon hurricane details aax call  started =========================");
	Functions.get_aaxcal_hurricanedetails();
 	System.out.println("================= Verifying amazon hurricane details aax call End =========================");
}

	@Test(priority=100,enabled = true)
	@Title("Verifying iu value for snapshot ad call iu")
	public void Smoke_Test_Verify_snapshotcard_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_snapshotcard_adcall_iu Started =========================");
		
		CharlesFunctions.ClearSessions();
		AppiumFunctions.Kill_launch();
		CharlesFunctions.startSessionBrowserData();
		AppiumFunctions.click_snapShot_button();
		CharlesFunctions.ExportSession();
		Functions.Verify_snapshot_spotlight_adcard_iu();
     	System.out.println("================= Verify_snapshotcard_adcall_iu End =========================");
	}
	@Test(priority=101,enabled = true)
	@Title("Verifying iu value for snapshot ad call iu")
	public void Smoke_Test_Verify_snapshot_spotlight_adcall_iu()
			throws Exception {
		System.out.println("================= Verify_snapshot_spotlight_adcall_iu Started =========================");
		Functions.Verify_snapshot_spotlight_iu();
     	System.out.println("================= Verify_snapshot_spotlight_adcall_iu End =========================");
	}
	@BeforeTest
	public void Before_Test() throws Exception {
		System.out.println("================= Before Test Started =========================");
	CharlesFunctions.charlesOpen();
		AppiumFunctions.UnInstallApp();
		CharlesFunctions.openCharlesBrowser();
		//MapLocalFunctions.alertModeChanges("withoutalert");
		//CharlesFunctions.ClearSessions();
		//AppiumFunctions.killADB();
		//AppiumFunctions.UnInstallApp();
		//		AppiumFunctions.AppiumServerStop();
		//		AppiumFunctions.AppiumServerStart();
		CharlesFunctions.ClearSessions();
		AppiumFunctions.LaunchAppWithFullReset();
	//	AppiumFunctions.Kill_launch();
		/*AppiumFunctions.ClickonIUnderstand();
		//AppiumFunctions.clickOnNext();
		//AppiumFunctions.clickOnUnderstandbutton();
		CharlesFunctions.startSessionBrowserData();
	    AppiumFunctions.SwipeUp_Counter(2);
	    AppiumFunctions.clickOnVideoElement();
		AppiumFunctions.clickOnBackArrowElement();
		 AppiumFunctions.SwipeUp_Counter(1);
	    AppiumFunctions.clickOnRadarMaps();
		AppiumFunctions.clickOnBackArrowElement();
		//AppiumFunctions.SwipeUp_Counter(1);
		// AppiumFunctions.clickOnVideoElement();
		//AppiumFunctions.clickOnBackArrowElement();
		AppiumFunctions.SwipeUp_Counter(1);
		AppiumFunctions.click_Todaydetails_element();
		AppiumFunctions.clickOnBackArrowElement();
		AppiumFunctions.SwipeUp_Counter(1);
		//AppiumFunctions.click_Boat_Beach_element();
		//AppiumFunctions.clickOnBackArrowElement();
		AppiumFunctions.click_Running_element();
		AppiumFunctions.clickOnBackArrowElement();
		AppiumFunctions.click_cold_Flu_element();
		AppiumFunctions.clickOnBackArrowElement();
		AppiumFunctions.click_Allergy_element();
		AppiumFunctions.clickOnBackArrowElement();
		AppiumFunctions.SwipeUp_Counter(2);
		AppiumFunctions.click_Airpollution_element();
		AppiumFunctions.clickOnBackArrowElement();
		AppiumFunctions.SwipeUp_Counter(2);
		AppiumFunctions.click_news_element();	*/	
		//AppiumFunctions.clickOnBackArrowElement();
	
		
		
	//	CharlesFunctions.ExportSession();	
			
		
		
		
		
		//AppiumFunctions.LaunchAppWithFullReset("true");
		//Ad.quit();
		//	AppiumFunctions.LaunchAppWithFullReset("false");
		//		
		System.out.println("================= Before Test End =========================");
 
		
	
	}



	//

	@AfterTest
	public void After_Test() throws Exception{
		/*System.out.println("After Test started");

		TemporaryFilesystem.getDefaultTmpFS().deleteTemporaryFiles();
		Ad.quit();*/

	}

}
