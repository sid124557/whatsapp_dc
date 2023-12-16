package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.36N  reason: invalid class name */
public class AnonymousClass36N {
    public static void A0A(C55682qk r5, AnonymousClass1VX r6, String str, String str2, long j, boolean z) {
        if (str2 == null) {
            C626936e.A0D(AnonymousClass000.A1S((j > 0 ? 1 : (j == 0 ? 0 : -1))), "loggableStanzaId must be >= 1.");
        }
        if (z && j == 0 && r6.A0Y(C58422vE.A02, 4207)) {
            r5.A0A("ack-without-loggable-stanza-id", false, AnonymousClass000.A0V("-", str2, AnonymousClass000.A0l(str)));
        }
    }

    public static Bundle A00(Message message) {
        Object obj = message.obj;
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        if (message.peekData() != null) {
            return message.getData();
        }
        return null;
    }

    public static Message A01() {
        return AnonymousClass0x7.A0G(13);
    }

    public static Message A02(C55682qk r7, AnonymousClass1VX r8, AnonymousClass39T r9) {
        C55682qk r0 = r7;
        AnonymousClass1VX r1 = r8;
        A0A(r0, r1, r9.A05, r9.A03(), r9.A00, r9.A04());
        return C18290x4.A0J(129, r9);
    }

    public static Message A03(C55682qk r7, AnonymousClass1VX r8, AnonymousClass39T r9) {
        C55682qk r0 = r7;
        AnonymousClass1VX r1 = r8;
        A0A(r0, r1, r9.A05, r9.A03(), r9.A00, r9.A04());
        return C18290x4.A0J(76, r9);
    }

    public static Message A04(C55682qk r7, AnonymousClass1VX r8, AnonymousClass39T r9, boolean z) {
        C55682qk r0 = r7;
        AnonymousClass1VX r1 = r8;
        A0A(r0, r1, "notification-contact", r9.A03(), r9.A00, true);
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("stanzaKey", r9);
        A08.putBoolean("isValid", z);
        return C18290x4.A0J(42, A08);
    }

    public static Message A05(String str, byte[] bArr, boolean z) {
        Log.d("XmppSendMessage/encodeSendSetRecoveryToken");
        Message A0G = AnonymousClass0x7.A0G(35);
        A0G.getData().putByteArray("rc", bArr);
        A0G.getData().putString("rcJid", str);
        A0G.getData().putBoolean("saveRecoveryToken", z);
        return A0G;
    }

    public static Message A06(boolean z) {
        return Message.obtain((Handler) null, 0, 37, 0, Boolean.valueOf(z));
    }

    public static C52562lg A08(Message message, AnonymousClass1VX r10) {
        AnonymousClass36K r3;
        long j;
        AnonymousClass39T r4;
        AnonymousClass36K r32;
        String str;
        Bundle bundle;
        String str2;
        DeviceJid deviceJid;
        DeviceJid deviceJid2;
        String str3;
        String str4;
        int i = message.arg1;
        if (i == 9) {
            Object obj = message.obj;
            C626936e.A06(obj);
            C624134x r0 = (C624134x) obj;
            r3 = AnonymousClass36Z.A05(r0);
            j = r0.A1O;
        } else if (i != 11) {
            if (i != 76) {
                if (i != 89) {
                    if (i == 96) {
                        Bundle A00 = A00(message);
                        C626936e.A06(A00);
                        r4 = (AnonymousClass39T) A00.getParcelable("stanzaKey");
                        C626936e.A06(r4);
                        r32 = null;
                        if (A00.getBoolean("disable")) {
                            AnonymousClass39V r2 = new AnonymousClass39V("readreceipts", "disable");
                            AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
                            A1V[0] = r2;
                            r32 = AnonymousClass36K.A0J("features", A1V, (AnonymousClass36K[]) null);
                        }
                    } else if (i != 129) {
                        if (i == 362) {
                            Object obj2 = message.obj;
                            C626936e.A06(obj2);
                            AnonymousClass3SS r1 = (AnonymousClass3SS) obj2;
                            r3 = AnonymousClass36Z.A01(C106405Yw.A03(r1.BCm()), DeviceJid.of(r1.A07), (UserJid) null, r1.A08, (String) null, (String[]) null);
                            j = 0;
                        } else if (i != 419) {
                            if (i == 431) {
                                Object obj3 = message.obj;
                                C626936e.A06(obj3);
                                AnonymousClass2RT r02 = (AnonymousClass2RT) obj3;
                                r3 = AnonymousClass36Z.A00(r02.A01, r02.A02, (Integer) null, r02.A04, (String) null, r02.A03, (String) null);
                                j = r02.A00;
                            } else if (!r10.A0Y(C58422vE.A02, 6175)) {
                                return null;
                            } else {
                                if (i == 42) {
                                    Bundle A002 = A00(message);
                                    C626936e.A06(A002);
                                    r4 = (AnonymousClass39T) A002.getParcelable("stanzaKey");
                                    if (A002.getBoolean("isValid")) {
                                        str = "in";
                                    } else {
                                        str = "out";
                                    }
                                    AnonymousClass39V r12 = new AnonymousClass39V("contacts", str);
                                    AnonymousClass39V[] A1V2 = AnonymousClass0x9.A1V();
                                    A1V2[0] = r12;
                                    r32 = AnonymousClass36K.A0J("sync", A1V2, (AnonymousClass36K[]) null);
                                } else if (i != 157) {
                                    switch (i) {
                                        case AnonymousClass1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                                            bundle = A00(message);
                                            C626936e.A06(bundle);
                                            str2 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                            deviceJid = A07(bundle, "jid");
                                            deviceJid2 = A07(bundle, "callCreatorJid");
                                            str3 = bundle.getString("callId");
                                            str4 = "offer";
                                            break;
                                        case 72:
                                            bundle = A00(message);
                                            C626936e.A06(bundle);
                                            str2 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                            deviceJid = A07(bundle, "jid");
                                            deviceJid2 = A07(bundle, "callCreatorJid");
                                            str3 = bundle.getString("callId");
                                            str4 = "accept";
                                            break;
                                        case 73:
                                            bundle = A00(message);
                                            C626936e.A06(bundle);
                                            str2 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                            deviceJid = A07(bundle, "jid");
                                            deviceJid2 = A07(bundle, "callCreatorJid");
                                            str3 = bundle.getString("callId");
                                            str4 = "reject";
                                            break;
                                        default:
                                            return null;
                                    }
                                    r3 = AnonymousClass36Z.A02(deviceJid, deviceJid2, str2, str3, str4);
                                    j = bundle.getLong("loggableStanzaId");
                                } else {
                                    Bundle A003 = A00(message);
                                    C626936e.A06(A003);
                                    r3 = AnonymousClass36Z.A03(A07(A003, "jid"), A07(A003, "callCreatorJid"), A003.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), A003.getString("callId"), A003.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), A003.getByteArray("registrationId"), A003.getByte("retry"));
                                    j = A003.getLong("loggableStanzaId");
                                }
                            }
                        }
                    }
                    r3 = AnonymousClass36Z.A06(r32, r4);
                    j = r4.A00;
                }
                AnonymousClass2T1 r03 = (AnonymousClass2T1) message.obj;
                AnonymousClass2z0 r42 = r03.A05;
                String str5 = r03.A06;
                String[] strArr = r03.A01;
                r3 = AnonymousClass36Z.A01(r03.A02, r03.A03, r03.A04, r42, str5, strArr);
                j = r03.A00;
            }
            AnonymousClass39T r13 = (AnonymousClass39T) message.obj;
            r3 = AnonymousClass36Z.A06(r13.A01(), r13);
            j = r13.A00;
        } else {
            AnonymousClass2U5 r04 = (AnonymousClass2U5) message.obj;
            r3 = AnonymousClass36Z.A04(r04);
            j = r04.A03;
        }
        return new C52562lg(r3, (Long) null, j);
    }

    public static void A09(Bundle bundle, DeviceJid deviceJid, Jid jid, String str, String str2, long j) {
        bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        bundle.putString("jid", C627336j.A07(jid));
        bundle.putString("callCreatorJid", C627336j.A07(deviceJid));
        bundle.putString("callId", str2);
        bundle.putLong("loggableStanzaId", j);
    }

    public static DeviceJid A07(BaseBundle baseBundle, String str) {
        DeviceJid nullable = DeviceJid.getNullable(baseBundle.getString(str));
        C626936e.A06(nullable);
        return nullable;
    }
}
