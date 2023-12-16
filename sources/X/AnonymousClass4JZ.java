package X;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4JZ  reason: invalid class name */
public class AnonymousClass4JZ implements NfcAdapter.CreateNdefMessageCallback {
    public Object A00;
    public final int A01;

    public AnonymousClass4JZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        if (this.A01 != 0) {
            C50322hz r9 = (C50322hz) this.A00;
            Log.i("NfcChatHandlerImpl/onActivityCreated/createndef");
            NdefRecord[] ndefRecordArr = new NdefRecord[2];
            AnonymousClass66R r6 = r9.A08;
            byte[] A1a = C18320x8.A1a("application/com.whatsapp.chat", (Charset) C18300x5.A0d(r6));
            C56972sr r8 = r9.A00;
            byte[] A1a2 = C18320x8.A1a(C56972sr.A06(r8), (Charset) C18300x5.A0d(r6));
            JSONObject A1G = AnonymousClass0x9.A1G();
            try {
                A1G.put("jid", C56972sr.A06(r8));
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AnonymousClass35J.A02(r8, r9.A03));
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r8.A0D.A03());
            } catch (JSONException e) {
                Log.e("NfcChatHandlerImpl/createNdefRecordPayload", e);
            }
            ndefRecordArr[0] = new NdefRecord(2, A1a, A1a2, C18320x8.A1a(C18290x4.A0o(A1G), (Charset) C18300x5.A0d(r6)));
            NdefRecord createApplicationRecord = NdefRecord.createApplicationRecord("com.whatsapp");
            C162457s7.A0D(createApplicationRecord);
            ndefRecordArr[1] = createApplicationRecord;
            return new NdefMessage(ndefRecordArr);
        }
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
        if (identityVerificationActivity.A0I == null) {
            Log.w("idverification/createndef/no-fingerprint");
            return null;
        }
        return new NdefMessage(new NdefRecord[]{new NdefRecord(2, "application/com.whatsapp.identity".getBytes(Charset.forName("US-ASCII")), C56972sr.A06(identityVerificationActivity.A01).getBytes(Charset.forName("US-ASCII")), identityVerificationActivity.A0I.A02.A0F()), NdefRecord.createApplicationRecord("com.whatsapp")});
    }
}
