package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.3aX  reason: invalid class name and case insensitive filesystem */
public class C70463aX implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C70463aX(Object obj, Object obj2, String str, int i, long j) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A00 = j;
    }

    public final void run() {
        String str;
        String str2;
        switch (this.A04) {
            case 0:
                AnonymousClass5PC r6 = (AnonymousClass5PC) this.A01;
                Jid jid = (Jid) this.A02;
                String str3 = this.A03;
                long j = this.A00;
                try {
                    AnonymousClass5UW r1 = r6.A0D;
                    C152217Ya A032 = r1.A03(jid, str3);
                    if (A032 != null) {
                        A032.A00 = j;
                        r1.A05(A032, jid);
                        C152217Ya A033 = r1.A03(jid, str3);
                        if (A033 != null) {
                            AnonymousClass08M r3 = r6.A0A;
                            if (r3 != null) {
                                r3.A0G(C18290x4.A0K(str3, (int) A033.A00));
                                return;
                            }
                            return;
                        }
                    }
                    AnonymousClass08M r0 = r6.A06;
                    if (r0 != null) {
                        AnonymousClass0x7.A18(r0);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    AnonymousClass08M r02 = r6.A06;
                    if (r02 != null) {
                        AnonymousClass0x7.A18(r02);
                        return;
                    }
                    return;
                }
            case 1:
                ((VoiceServiceEventCallback) this.A01).lambda$setScheduledCallJoinTimeDiffMs$7(this.A03, (GroupJid) this.A02, this.A00);
                return;
            case 2:
                AnonymousClass1QM r11 = (AnonymousClass1QM) this.A01;
                Context context = (Context) this.A02;
                String str4 = this.A03;
                long j2 = this.A00;
                Activity A002 = C621633u.A00(context);
                if (A002 == null) {
                    str = "SendLocationAction/execute/findActivityContextResultedNull";
                } else if (A002 instanceof AnonymousClass67A) {
                    AnonymousClass67A r2 = (AnonymousClass67A) A002;
                    String A06 = C627336j.A06(r2);
                    if (A06 != null) {
                        boolean A05 = r11.A02.A05(A002.getApplicationContext());
                        boolean BFL = r2.BFL();
                        Context applicationContext = context.getApplicationContext();
                        boolean A0Y = r11.A01.A0Y(C58422vE.A02, 2570);
                        Intent A07 = C18320x8.A07();
                        A07.putExtra("jid", A06);
                        A07.putExtra("quoted_message_row_id", j2);
                        A07.putExtra("has_number_from_url", BFL);
                        A07.putExtra("start_in_fullscreen_mode", A0Y);
                        String packageName = applicationContext.getPackageName();
                        if (A05) {
                            str2 = "com.whatsapp.location.LocationPicker2";
                        } else {
                            str2 = "com.whatsapp.location.LocationPicker";
                        }
                        A07.setClassName(packageName, str2);
                        HashMap A0t = AnonymousClass001.A0t();
                        A0t.put("message_id", str4);
                        A0t.put("chat_id", A06);
                        A07.putExtra("carry_forward_extras", A0t);
                        A002.startActivityForResult(A07, 904);
                        return;
                    }
                    str = "SendLocationAction/execute/jidIsNull";
                } else {
                    str = "SendLocationAction/execute/findActivityContextIsNotConversationInterface";
                }
                Log.e(str);
                return;
            default:
                C55422qK r22 = (C55422qK) this.A01;
                C95814uZ r12 = (C95814uZ) this.A02;
                String str5 = this.A03;
                long j3 = this.A00;
                C85284Fq A042 = r22.A05.A04();
                try {
                    long A072 = r22.A03.A07(r12);
                    ContentValues A073 = AnonymousClass0x9.A07(1);
                    C18270x1.A0c(A073, "call_log_row_id", j3);
                    C56862sg r8 = ((AnonymousClass3H0) A042).A03;
                    String[] A1Z = AnonymousClass0x9.A1Z();
                    C18260x0.A1X(A1Z, A072);
                    A1Z[1] = str5;
                    if (r8.A05(A073, "scheduled_calls", "key_chat_row_id = ? AND key_id = ?", "ScheduledCallsStore/UPDATE_CALL_LOG_ROW_ID_BY_KEY_ID_AND_CHAT", A1Z) == 0) {
                        Log.w("ScheduledCallsStore/updateCallLogRowId (by key_id and chat) failed to update");
                    }
                    A042.close();
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
        }
    }
}
