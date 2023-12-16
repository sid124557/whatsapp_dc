package X;

import com.whatsapp.calling.CallSummary;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallParticipant;
import java.util.ArrayList;

/* renamed from: X.3bN  reason: invalid class name and case insensitive filesystem */
public class C70983bN implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public boolean A07;
    public final int A08;

    public C70983bN(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3, boolean z) {
        this.A08 = i3;
        this.A02 = obj;
        this.A06 = str;
        this.A03 = obj2;
        this.A07 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = obj3;
        this.A05 = obj4;
    }

    public final void run() {
        if (this.A08 != 0) {
            ((VoiceServiceEventCallback) this.A02).lambda$updateJoinableCallLog$0(this.A06, (UserJid) this.A03, this.A07, this.A00, this.A01, (CallParticipant[]) this.A04, (CallSummary) this.A05);
            return;
        }
        C614830y r9 = (C614830y) this.A02;
        String str = this.A06;
        UserJid userJid = (UserJid) this.A03;
        boolean z = this.A07;
        int i = this.A00;
        int i2 = this.A01;
        CallParticipant[] callParticipantArr = (CallParticipant[]) this.A04;
        CallSummary callSummary = (CallSummary) this.A05;
        AnonymousClass3ZF A042 = r9.A04(str);
        if (A042 == null) {
            if (userJid != null) {
                Log.d("No call log found by call-id, fetch call log by the key");
                A042 = r9.A03(userJid, str, i, z);
                if (A042 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        r9.A05(callSummary, A042, callParticipantArr, i2);
        C107285b3 r1 = r9.A03;
        if (str.equals(r1.A0y)) {
            r1.A0y = null;
            C623234o r5 = (C623234o) r1.A39.get();
            C162457s7.A0J(callParticipantArr, 0);
            ArrayList A0I = AnonymousClass002.A0I(r3);
            for (CallParticipant callParticipant : callParticipantArr) {
                A0I.add(callParticipant.jid);
            }
            r5.A08(A042, C73723fy.A0P(A0I), false);
        }
    }
}
