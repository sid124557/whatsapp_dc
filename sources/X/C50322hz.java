package X;

import android.app.Activity;
import android.content.Intent;
import android.nfc.NfcAdapter;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.2hz  reason: invalid class name and case insensitive filesystem */
public final class C50322hz {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C620633i A02;
    public final C56612sH A03;
    public final AnonymousClass5ZR A04;
    public final C56542sA A05;
    public final C56982ss A06;
    public final C66543Lv A07;
    public final AnonymousClass66R A08 = C154517dI.A01(C817140u.A00);

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            r7 = 0
            boolean r0 = X.C107385bE.A0B()
            if (r0 != 0) goto L_0x00e5
            java.lang.String r1 = r10.getAction()
            java.lang.String r0 = "android.nfc.action.NDEF_DISCOVERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e5
            java.lang.String r4 = "NfcChatHandlerImpl/processNfcIntent"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            java.lang.String r0 = "android.nfc.extra.NDEF_MESSAGES"
            android.os.Parcelable[] r1 = r10.getParcelableArrayExtra(r0)
            if (r1 == 0) goto L_0x00e5
            int r0 = r1.length
            if (r0 != 0) goto L_0x002b
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x002b:
            r5 = r1[r7]
            boolean r0 = r5 instanceof android.nfc.NdefMessage
            r6 = 0
            if (r0 == 0) goto L_0x00e5
            android.nfc.NdefMessage r5 = (android.nfc.NdefMessage) r5
            if (r5 == 0) goto L_0x00e5
            android.nfc.NdefRecord[] r0 = r5.getRecords()
            r0 = r0[r7]
            byte[] r2 = r0.getType()
            X.C162457s7.A0D(r2)
            X.66R r3 = r8.A08
            java.lang.Object r0 = X.C18300x5.A0d(r3)
            java.nio.charset.Charset r0 = (java.nio.charset.Charset) r0
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r0)
            java.lang.String r0 = "application/com.whatsapp.chat"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e5
            android.nfc.NdefRecord[] r0 = r5.getRecords()
            r0 = r0[r7]
            byte[] r2 = r0.getPayload()
            X.C162457s7.A0D(r2)
            java.lang.Object r1 = X.C18300x5.A0d(r3)
            java.nio.charset.Charset r1 = (java.nio.charset.Charset) r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1)
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = "jid"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0088 }
            goto L_0x0094
        L_0x0088:
            r0 = move-exception
            goto L_0x0090
        L_0x008a:
            r0 = move-exception
            r3 = r6
            r2 = r6
            goto L_0x0090
        L_0x008e:
            r0 = move-exception
            r2 = r6
        L_0x0090:
            com.whatsapp.util.Log.e(r4, r0)
            r1 = r6
        L_0x0094:
            X.4uZ r4 = X.C18310x6.A0S(r3)
            if (r4 == 0) goto L_0x00d0
            if (r2 == 0) goto L_0x00d0
            X.2ss r0 = r8.A06
            boolean r0 = r0.A0L(r4)
            if (r0 != 0) goto L_0x00be
            X.3Ex r0 = r8.A01
            X.3ZH r0 = r0.A07(r4)
            X.2sA r2 = r8.A05
            if (r0 == 0) goto L_0x00b2
            X.2k5 r0 = r0.A0F
            if (r0 != 0) goto L_0x00b3
        L_0x00b2:
            r6 = r1
        L_0x00b3:
            r0 = 20
            X.3Zz r5 = new X.3Zz
            r5.<init>(r8, r0, r4)
            r3 = 0
            r2.A02(r3, r4, r5, r6, r7)
        L_0x00be:
            X.36r r0 = new X.36r
            r0.<init>()
            android.content.Intent r1 = r0.A1O(r9, r4, r7)
            java.lang.String r0 = "NewChatNfc:processNfcIntent"
            X.AnonymousClass5VI.A00(r1, r0)
            r9.startActivity(r1)
            return
        L_0x00d0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NfcChatHandlerImpl/processNfcIntent jid is invalid: "
            r1.append(r0)
            java.lang.String r0 = X.C627336j.A07(r4)
            r1.append(r0)
            java.lang.String r0 = " id: "
            X.C18260x0.A0s(r0, r2, r1)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50322hz.A01(android.content.Context, android.content.Intent):void");
    }

    public void A00(Activity activity) {
        if (!C107385bE.A0B() && this.A02.A0N.A00.getPackageManager().hasSystemFeature("android.hardware.nfc") && this.A04.A02("android.permission.NFC") == 0) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
            if (defaultAdapter != null) {
                try {
                    NfcAdapter.class.getMethod("setNdefPushMessageCallback", new Class[]{NfcAdapter.CreateNdefMessageCallback.class, Activity.class, Activity[].class}).invoke(defaultAdapter, new Object[]{new AnonymousClass4JZ(this, 1), activity, new Activity[0]});
                } catch (IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                    Log.i("NfcChatHandlerImpl/onActivityCreated ", e);
                }
            }
            if ("android.nfc.action.NDEF_DISCOVERED".equals(activity.getIntent().getAction())) {
                Intent intent = activity.getIntent();
                C162457s7.A0D(intent);
                A01(activity, intent);
            }
        }
    }

    public C50322hz(C56972sr r2, C64773Ex r3, C620633i r4, C56612sH r5, AnonymousClass5ZR r6, C56542sA r7, C56982ss r8, C66543Lv r9) {
        C18260x0.A0f(r5, r2, r8, r7, r3);
        C18260x0.A0W(r4, r9, r6);
        this.A03 = r5;
        this.A00 = r2;
        this.A06 = r8;
        this.A05 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r9;
        this.A04 = r6;
    }
}
