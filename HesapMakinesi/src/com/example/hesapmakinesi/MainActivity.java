package com.example.hesapmakinesi;
/*
 * Author Osman Aşar
 * version:1.0
 * Bilimsel Hesap Makinesi
 * 
 * */
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener{
	EditText screen,screenYDK;
	Button num0;
	Button num1;
	Button num2;
	Button num3;
	Button num4;
	Button num5;
	Button num6;
	Button num7;
	Button num8;
	Button num9;
	Button plusOp;
	Button minusOp;
	Button mixOp;
	Button divOp;
	Button equalOp;
	Button deleteOp;
	Button ButtonSq;
	Button backSlash;
	Button dot;
	Button sign;
	Button bSin;
	Button bCos;
	Button bTan;
	Button bCot;
	Button bPI;
	Button bE;
	Button bAtan;
	Button bAcot;
	Button bAsin;
	Button bAcos;
	Button bCq;
	Button bX;
	Button bXN;
	Button log;
	Button log10;
	Button ln;
	Button round;
	Button en;
	String number,txtYdk,operation,control;
	double dNumber;
	double firstN=0,secondN=0,result=0;
    double degree,radian;
    MediaPlayer ses;
	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        ses=MediaPlayer.create(this, R.raw.click);
        
        init();
        ButtonOperation();
        
        
        
    }

    private void ButtonOperation() {
		num0.setOnClickListener(this);
		num1.setOnClickListener(this);
		num2.setOnClickListener(this);
		num3.setOnClickListener(this);
		num4.setOnClickListener(this);
		num5.setOnClickListener(this);
		num6.setOnClickListener(this);
		num7.setOnClickListener(this);
		num8.setOnClickListener(this);
		num9.setOnClickListener(this);
		plusOp.setOnClickListener(this);
		minusOp.setOnClickListener(this);
		mixOp.setOnClickListener(this);
		divOp.setOnClickListener(this);
		equalOp.setOnClickListener(this);
		deleteOp.setOnClickListener(this);
		ButtonSq.setOnClickListener(this);
		backSlash.setOnClickListener(this);
		dot.setOnClickListener(this);
		sign.setOnClickListener(this);
		bSin.setOnClickListener(this);
		bCos.setOnClickListener(this);
		bTan.setOnClickListener(this);
		bCot.setOnClickListener(this);
		bPI.setOnClickListener(this);
		bE.setOnClickListener(this);
		bAtan.setOnClickListener(this);
		bAcot.setOnClickListener(this);
		bAsin.setOnClickListener(this);
		bAcos.setOnClickListener(this);
		bCq.setOnClickListener(this);
		bX.setOnClickListener(this);
		bXN.setOnClickListener(this);
		log.setOnClickListener(this);
		log10.setOnClickListener(this);
		ln.setOnClickListener(this);
		round.setOnClickListener(this);
		en.setOnClickListener(this);
	}

	private void init() {
		num0=(Button)findViewById(R.id.button0);
		num1=(Button)findViewById(R.id.button1);
		num2=(Button)findViewById(R.id.button2);
		num3=(Button)findViewById(R.id.button3);
		num4=(Button)findViewById(R.id.button4);
		num5=(Button)findViewById(R.id.button5);
		num6=(Button)findViewById(R.id.button6);
		num7=(Button)findViewById(R.id.button7);
		num8=(Button)findViewById(R.id.button8);
		num9=(Button)findViewById(R.id.button9);
		plusOp=(Button)findViewById(R.id.buttonArti);
		minusOp=(Button)findViewById(R.id.buttonEksi);
		mixOp=(Button)findViewById(R.id.buttonCarpma);
		divOp=(Button)findViewById(R.id.buttonBolme);
		equalOp=(Button)findViewById(R.id.buttonEsit);
		deleteOp=(Button)findViewById(R.id.buttonC);
		ButtonSq=(Button)findViewById(R.id.buttonKok);
		backSlash=(Button)findViewById(R.id.buttonBS);
		dot=(Button)findViewById(R.id.buttonDot);
		sign=(Button)findViewById(R.id.buttonSign);
		bSin=(Button)findViewById(R.id.buttonSin);
		bCos=(Button)findViewById(R.id.buttonCos);
		bTan=(Button)findViewById(R.id.buttonTan);
		bCot=(Button)findViewById(R.id.buttonCot);
		bPI=(Button)findViewById(R.id.buttonPi);
		bE=(Button)findViewById(R.id.buttonE);
		bAtan=(Button)findViewById(R.id.buttonAtan);
		bAcot=(Button)findViewById(R.id.buttonAcot);
		bAsin=(Button)findViewById(R.id.buttonAsin);
		bAcos=(Button)findViewById(R.id.buttonAcos);
		bCq=(Button)findViewById(R.id.buttonKokUc);
		bX=(Button)findViewById(R.id.buttonX);
		bXN=(Button)findViewById(R.id.buttonXN);
		log=(Button)findViewById(R.id.buttonLog2);
		log10=(Button)findViewById(R.id.buttonLog10);
		ln=(Button)findViewById(R.id.buttonLn);
		round=(Button)findViewById(R.id.buttonRound);
		en=(Button)findViewById(R.id.buttonEn);
		screen=(EditText)findViewById(R.id.txtCalc);
		screenYDK=(EditText)findViewById(R.id.editText1);
		
	}
    @Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button0:
			ses.start();
			screen.setText(screen.getText().toString()+"0");
			break;
		case R.id.button1:
			ses.start();
			screen.setText(screen.getText().toString()+"1");
			break;
		case R.id.button2:
			ses.start();
			screen.setText(screen.getText().toString()+"2");
			break;
		case R.id.button3:
			ses.start();
			screen.setText(screen.getText().toString()+"3");
			break;
		case R.id.button4:
			ses.start();
			screen.setText(screen.getText().toString()+"4");
			break;
		case R.id.button5:
			ses.start();
			screen.setText(screen.getText().toString()+"5");
			break;
		case R.id.button6:
			ses.start();
			screen.setText(screen.getText().toString()+"6");
			break;
		case R.id.button7:
			ses.start();
			screen.setText(screen.getText().toString()+"7");
			break;
		case R.id.button8:
			ses.start();
			screen.setText(screen.getText().toString()+"8");
			break;
		case R.id.button9:
			ses.start();
			screen.setText(screen.getText().toString()+"9");
			break;
		case R.id.buttonDot:
			ses.start();
			if(screen.getText().toString().equals(""))
			screen.setText("0");
			screen.setText(screen.getText().toString()+".");
			break;
		case R.id.buttonRound:
			ses.start();
			operation="round";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				dNumber=Double.parseDouble(txtYdk);
				result=Math.round(dNumber);
				screenYDK.setText("round("+dNumber+")=");
				screen.setText(String.valueOf(result));
				
				
			}
			
			break;
		case R.id.buttonEn:
			ses.start();
			operation="en";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				dNumber=Double.parseDouble(txtYdk);
				result=Math.exp(dNumber);
				screenYDK.setText("e^"+dNumber+"=");
				screen.setText(String.valueOf(result));
				
				
			}
			break;
			
		case R.id.buttonLog2:
			ses.start();
			operation="log";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				dNumber=Double.parseDouble(txtYdk);
				result=Math.log(dNumber)/Math.log(2);
				screenYDK.setText("log2("+dNumber+")=");
				screen.setText(String.valueOf(result));
				
				
			}
			
			break;
			
		case R.id.buttonLog10:
			ses.start();
			operation="log10";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				dNumber=Double.parseDouble(txtYdk);
				result=Math.log10(dNumber);
				screenYDK.setText("log10("+dNumber+")=");
				screen.setText(String.valueOf(result));
				
				
			}
			break;
			
		case R.id.buttonLn:
			ses.start();
			operation="ln";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				dNumber=Double.parseDouble(txtYdk);
				result=Math.log(dNumber);
				screenYDK.setText("lne("+dNumber+")=");
				screen.setText(String.valueOf(result));
				
				
			}
			break;
		case R.id.buttonSign:
			ses.start();
			txtYdk = screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
			if(!txtYdk.equals("0") && !txtYdk.equals("0.0") ){
				
				if (txtYdk.charAt(0) == '-')
					txtYdk = txtYdk.substring(1, txtYdk.length());
				else
					txtYdk = "-" + txtYdk;
			
			}
				screen.setText(txtYdk);
			}
		
			break;
		case R.id.buttonPi:
			ses.start();
			operation="pi";
			screenYDK.setText("PI=");
			screen.setText(String.valueOf(Math.PI));
			
			break;
			
		case R.id.buttonE:
			ses.start();
			operation="e";
			screenYDK.setText("e=");
			screen.setText(String.valueOf(Math.E));
			break;
		case R.id.buttonAtan:
			ses.start();
			operation="atan";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				dNumber=Double.parseDouble(txtYdk);
				radian=Math.atan(dNumber);
				degree=(radian*180)/Math.PI;
				screenYDK.setText("arctan("+dNumber+")=");
				screen.setText(String.valueOf(degree));
				
				
			}
			break;
		case R.id.buttonAcot:
			ses.start();
			operation="acot";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				dNumber=Double.parseDouble(txtYdk);
				radian=Math.atan(1/dNumber);
				degree=(radian*180)/Math.PI;
				screenYDK.setText("arccot("+dNumber+")=");
				screen.setText(String.valueOf(degree));
				
				
			}
			break;
		case R.id.buttonAsin:
			ses.start();
			operation="asin";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				dNumber=Double.parseDouble(txtYdk);
				radian=Math.asin(dNumber);
				degree=(radian*180)/Math.PI;
				screenYDK.setText("arcsin("+dNumber+")=");
				screen.setText(String.valueOf(degree));
				
				
			}
			break;
		case R.id.buttonAcos:
			ses.start();
			operation="acos";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				dNumber=Double.parseDouble(txtYdk);
				radian=Math.acos(dNumber);
				degree=(radian*180)/Math.PI;
				screenYDK.setText("arccos("+dNumber+")=");
				screen.setText(String.valueOf(degree));
				
				
			}
			break;
			
		case R.id.buttonSin:
			ses.start();
			operation="sin";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				radian=Double.parseDouble(txtYdk);
				degree=radian*Math.PI/180;
				result=Math.sin(degree);
				screenYDK.setText("sin("+txtYdk+")=");
				screen.setText(String.valueOf(result));
				
			}
			break;
			
		case R.id.buttonCos:
			ses.start();
			operation="cos";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				radian=Double.parseDouble(txtYdk);
				degree=radian*Math.PI/180;
				result=Math.cos(degree);
				screenYDK.setText("cos("+txtYdk+")=");
				screen.setText(String.valueOf(result));
				
			}
			
			break;
		case R.id.buttonTan:
			ses.start();
			operation="tan";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				radian=Double.parseDouble(txtYdk);
				degree=radian*Math.PI/180;
				result=Math.sin(degree)/Math.cos(degree);
				screenYDK.setText("tan("+txtYdk+")=");
				screen.setText(String.valueOf(result));
				
			}
	
			break;
		case R.id.buttonCot:
			ses.start();
			operation="cot";
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
				radian=Double.parseDouble(txtYdk);
				degree=radian*Math.PI/180;
				result=Math.cos(degree)/Math.sin(degree);
				screenYDK.setText("cot("+txtYdk+")=");
				screen.setText(String.valueOf(result));
				
			}
	
			break;
		case R.id.buttonX:
			ses.start();
            operation="x2";
			
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
			
			firstN=Double.parseDouble(txtYdk);
			screenYDK.setText(txtYdk+getResources().getString(R.string.x2));
			result=Math.pow(firstN, 2);
			screen.setText(String.valueOf(result));
			}
			break;
		case R.id.buttonXN:
			ses.start();
            operation="^";
			
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
			firstN=Double.parseDouble(txtYdk);
			screenYDK.setText(txtYdk+operation);
			screen.setText("");
			}
			break;
		case R.id.buttonArti:
			ses.start();
			operation="+";
			
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
			firstN=Double.parseDouble(txtYdk);
			screenYDK.setText(txtYdk+"+");
			screen.setText("");
			}
	
			break;
		case R.id.buttonEksi:
			ses.start();
			operation="-";
		
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
			firstN=Double.parseDouble(txtYdk);
			screenYDK.setText(txtYdk+"-");
			screen.setText("");
			}
			break;
		case R.id.buttonCarpma:
			ses.start();
			operation="*";
			
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
			firstN=Double.parseDouble(txtYdk);
			screenYDK.setText(txtYdk+"x");
			screen.setText("");
			}
			break;
		case R.id.buttonBolme:
			ses.start();
			operation="/";
			
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
			firstN=Double.parseDouble(txtYdk);
			screenYDK.setText(txtYdk+"/");
			screen.setText("");
			}
			break;
		case R.id.buttonC:
			   ses.start();
	           screen.setText("");
	           screenYDK.setText("");
			break;
		case R.id.buttonKok:
			ses.start();
			operation="√";
			
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
			firstN=Double.parseDouble(txtYdk);
			screenYDK.setText("√"+txtYdk+"=");
			result=Math.sqrt(firstN);
			screen.setText(String.valueOf(result));
			}
			break;
		case R.id.buttonKokUc:
			 ses.start();
		     operation="kok3";
		     txtYdk=screen.getText().toString();
				if(txtYdk.equals("")){}
				else{
				firstN=Double.parseDouble(txtYdk);
				screenYDK.setText("³√"+txtYdk+"=");
				result=Math.cbrt(firstN);
				screen.setText(String.valueOf(result));
				}
		
			break;
		case R.id.buttonBS:
			ses.start();
		    txtYdk = screen.getText().toString();
			if (txtYdk.length() > 0) {
				txtYdk = txtYdk.substring(0, txtYdk.length() - 1);//Burası en son haneyi almıyor..
				if (txtYdk.equals("")){
					txtYdk="";
				}
				
				screen.setText(txtYdk);
			
		      }
			
			break;
		case R.id.buttonEsit:
			ses.start();
			txtYdk=screen.getText().toString();
			if(txtYdk.equals("")){}
			else{
			secondN = Double.parseDouble(screen.getText().toString());
			
		
		   result = 0;

			switch (operation) {
			case "+":
				
				result = firstN + secondN;
				break;

			case "-":
				result = firstN - secondN;
				break;

			case "*":
				result = firstN * secondN;
				break;

			case "/":
				if (secondN != 0)
					result = firstN / secondN;

				break;
			
			case "^":
				result=Math.pow(firstN, secondN);
				break;
	

			}

			}
			
		
			if(!(operation.equals("√"))&&!(operation.equals("kok3"))&&!(operation.equals("round"))&&!(operation.equals("en"))&&!(operation.equals("log"))&&!(operation.equals("log10"))&&!(operation.equals("ln"))&&!(operation.equals("x2"))&&!(operation.equals("sin"))&&!(operation.equals("cos"))&&!(operation.equals("tan"))&&!(operation.equals("cot"))&&!(operation.equals("pi"))&&!(operation.equals("e"))&&!(operation.equals("atan"))&&!(operation.equals("acot"))&&!(operation.equals("asin"))&&!(operation.equals("acos"))){
			screenYDK.setText(firstN+operation+screen.getText().toString()+"="); 
			screen.setText(String.valueOf(result));
			}
			operation = "";
			break;
			
		
		
		}
		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	
}
