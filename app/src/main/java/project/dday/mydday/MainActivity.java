package project.dday.mydday;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    AlarmManager alarmManager;
    private int mYear;
    private int mMonth;
    private int mDay;

    private int mHour;
    private int mMinute;
    Calendar cal;
    PendingIntent pendingIntent;
    EditText etAlarmTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);

        cal = Calendar.getInstance();
        // 년월일시분 초기화xxxsss
        mYear = cal.get(Calendar.YEAR);
        mMonth = cal.get(Calendar.MONTH);
        mDay = cal.get(Calendar.DAY_OF_MONTH);
        mHour = cal.get(Calendar.HOUR_OF_DAY);
        mMinute = cal.get(Calendar.MINUTE);

        //etAlarmTitle = (EditText)findViewById(R.id.etAlarmTitle);

        //액션바 뒤로가기
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void onRClick(View v) {
        switch (v.getId()) {
           // case R.id.btndate: //이버튼을 누르면 날짜 설정 다이알로그
           //     new DatePickerDialog(AlarmActivity.this, dateSetListener, mYear, mMonth, mDay).show();
            //    break;
        }
    }
    //  다이알로그에서 설정한 년월일 미리생성한 변수에 넣어줌
    DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            mYear = year;
            mMonth = month;
            mDay = dayOfMonth;
        }
    };

    //액션바 뒤로가기
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    };
}
