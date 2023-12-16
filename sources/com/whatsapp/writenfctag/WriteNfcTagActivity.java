package com.whatsapp.writenfctag;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18280x3;
import X.C18320x8;
import X.C58152un;
import X.C60312yL;
import X.C620633i;
import X.C624735e;
import X.C64333Db;
import X.C89644eZ;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteNfcTagActivity extends C89644eZ {
    public PendingIntent A00;
    public NfcAdapter A01;
    public C60312yL A02;
    public String A03;
    public String A04;
    public boolean A05;

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A02 = (C60312yL) A002.A13.get();
        }
    }

    public WriteNfcTagActivity(int i) {
        this.A05 = false;
        AnonymousClass4HY.A00(this, 132);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Ha.A1z(this);
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setText(R.string.f11nameremoved);
        setContentView((View) textView);
        this.A04 = getIntent().getStringExtra("mime");
        this.A03 = getIntent().getStringExtra("data");
        this.A01 = NfcAdapter.getDefaultAdapter(this);
        Intent A07 = C18320x8.A07();
        A07.setClassName(getPackageName(), "com.whatsapp.writenfctag.WriteNfcTagActivity");
        A07.putExtra("mime", (String) null);
        A07.putExtra("data", (String) null);
        Intent addFlags = A07.addFlags(536870912);
        int i = 0;
        C624735e.A06(addFlags, 0);
        if (C624735e.A01) {
            i = 33554432;
        }
        this.A00 = PendingIntent.getActivity(this, 0, addFlags, i);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction()) || C18280x3.A1V(intent, "android.nfc.action.NDEF_DISCOVERED")) {
            Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
            NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{new NdefRecord(2, this.A04.getBytes(Charset.forName("US-ASCII")), (byte[]) null, this.A03.getBytes(Charset.forName("US-ASCII")))});
            int length = ndefMessage.toByteArray().length;
            try {
                Ndef ndef = Ndef.get(tag);
                if (ndef != null) {
                    ndef.connect();
                    if (!ndef.isWritable()) {
                        Log.e("writetag/failure/tag not writable");
                    } else if (ndef.getMaxSize() < length) {
                        Log.e("writetag/failure/tag too small");
                    } else {
                        ndef.writeNdefMessage(ndefMessage);
                    }
                    this.A05.A0H(R.string.f11nameremoved, 0);
                    return;
                }
                NdefFormatable ndefFormatable = NdefFormatable.get(tag);
                if (ndefFormatable != null) {
                    try {
                        ndefFormatable.connect();
                        ndefFormatable.format(ndefMessage);
                    } catch (IOException e) {
                        Log.e("writetag/failure/", e);
                    }
                }
                this.A05.A0H(R.string.f11nameremoved, 0);
                return;
                Log.i("writetag/success");
                this.A05.A0H(R.string.f11nameremoved, 1);
                C60312yL r2 = this.A02;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(C58152un.A04);
                r2.A01(Uri.parse(AnonymousClass000.A0h(A0o, R.raw.send_message)));
                C620633i.A05(this.A08);
                finish();
            } catch (Exception e2) {
                Log.e("writetag/failure/", e2);
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.A01.disableForegroundDispatch(this);
    }

    public void onResume() {
        super.onResume();
        IntentFilter[] intentFilterArr = new IntentFilter[2];
        AnonymousClass000.A16(new IntentFilter("android.nfc.action.TAG_DISCOVERED"), new IntentFilter("android.nfc.action.NDEF_DISCOVERED"), intentFilterArr);
        this.A01.enableForegroundDispatch(this, this.A00, intentFilterArr, (String[][]) null);
    }

    public WriteNfcTagActivity() {
        this(0);
    }
}
