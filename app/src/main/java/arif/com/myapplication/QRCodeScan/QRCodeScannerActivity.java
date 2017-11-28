package arif.com.myapplication.QRCodeScan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;

import com.google.android.gms.vision.barcode.Barcode;

import java.util.List;

import arif.com.myapplication.R;
import info.androidhive.barcode.BarcodeReader;

public class QRCodeScannerActivity extends AppCompatActivity implements BarcodeReader.BarcodeReaderListener {
    BarcodeReader barcodeReader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode_scanner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        barcodeReader = (BarcodeReader) getSupportFragmentManager().findFragmentById(R.id.barcode_scanner);
    }

    @Override
    public void onScanned(Barcode barcode) {
      //  Toast.makeText(getApplicationContext(), "scanned valie :" + barcode.displayValue, Toast.LENGTH_SHORT).show();
        barcodeReader.playBeep();
        Log.e("tag", "" + barcode.displayValue + "   ARIF");


    }
    @Override
    public void onScannedMultiple(List<Barcode> barcodes) {

    }

    @Override
    public void onBitmapScanned(SparseArray<Barcode> sparseArray) {

    }

    @Override
    public void onScanError(String errorMessage) {
        Toast.makeText(getApplicationContext(), "Error occurred while scanning " + errorMessage, Toast.LENGTH_SHORT).show();

    }
}
