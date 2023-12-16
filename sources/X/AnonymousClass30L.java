package X;

import java.util.Map;

/* renamed from: X.30L  reason: invalid class name */
public class AnonymousClass30L {
    public final AnonymousClass2WZ A00;
    public final AnonymousClass316 A01;

    public AnonymousClass30L(C56612sH r15, C54292oU r16, AnonymousClass1VX r17, AnonymousClass4FV r18, AnonymousClass2WZ r19, C84084Ay r20, AnonymousClass8JP r21, C186568vZ r22, AnonymousClass4FS r23) {
        AnonymousClass316 r4 = new AnonymousClass316(r15, r16, r18, r20, r21, r22, r23, "MessageSendPerfQplTracker", 154474694);
        C47122ck r3 = r4.A0A;
        r3.A05 = (!r17.A0Y(C58422vE.A02, 1191) ? (char) 1 : 3) != 1 ? true : r3.A05;
        this.A01 = r4;
        this.A00 = r19;
    }

    public String A01(String str, int i, int i2, int i3) {
        Integer num;
        if (i3 == 0) {
            AnonymousClass2WZ r1 = this.A00;
            synchronized (r1) {
                Map map = (Map) AnonymousClass001.A0i(r1.A00, i);
                if (map == null || (num = (Integer) AnonymousClass001.A0i(map, i2)) == null) {
                    i3 = 0;
                } else {
                    i3 = num.intValue();
                }
            }
        }
        if (i3 > 0) {
            return AnonymousClass000.A0Y("_", AnonymousClass000.A0l(str), i3);
        }
        return str;
    }

    public void A04(int i, int i2) {
        if (i2 != 8 && i2 != 7) {
            C18260x0.A0w("MessageSendPerfQplTracker/processStage instanceKey: ", AnonymousClass001.A0o(), i);
            AnonymousClass2WZ r1 = this.A00;
            synchronized (r1) {
                Map map = (Map) AnonymousClass001.A0i(r1.A00, i);
                if (map != null && ((Integer) AnonymousClass001.A0i(map, i2)) != null) {
                    A02(i, i2);
                }
            }
            int i3 = 2;
            switch (i2) {
                case 1:
                    break;
                case 2:
                    i3 = 5;
                    break;
                case 3:
                    A06(i, 2);
                    return;
                case 4:
                    i3 = 1;
                    break;
                case 5:
                    i3 = 6;
                    break;
                case 6:
                    i3 = 3;
                    break;
                default:
                    return;
            }
            A03(i, i3);
        }
    }

    public void A05(int i, int i2, int i3, int i4) {
        Map map;
        int i5;
        Integer valueOf;
        boolean containsKey;
        AnonymousClass2WZ r5 = this.A00;
        synchronized (r5) {
            map = r5.A00;
            i5 = i;
            valueOf = Integer.valueOf(i);
            containsKey = map.containsKey(valueOf);
        }
        if (containsKey) {
            A03(i, i2);
        } else if (i4 != 7 && i4 != 10 && i4 != 11 && i4 != 12) {
            C18260x0.A0w("MessageSendPerfQplTracker/markerStart instanceKey: ", AnonymousClass001.A0o(), i);
            AnonymousClass316 r3 = this.A01;
            r3.A06(i, "message_send", false);
            synchronized (r5) {
                map.put(valueOf, AnonymousClass001.A0t());
            }
            if (i3 >= 0) {
                int i6 = i3 + 1;
                String A012 = A01(A00(i2), i, i2, i6);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("MessageSendPerfQplTracker/markerBlockStart instanceKey: ");
                A0o.append(i);
                A0o.append("; block: ");
                A0o.append(A012);
                C18260x0.A0w("; sendStageCount: ", A0o, i6);
                r3.A04(i, A012);
                r5.A00(i, i2, i6);
            } else {
                A03(i, i2);
            }
            r3.A0C.markerAnnotate(r3.A0A.A07, i5, "wa_type", (long) i4);
        }
    }

    public static String A00(int i) {
        switch (i) {
            case 1:
                return "client_rendered";
            case 2:
                return "client_saved";
            case 3:
                return "client_written_wire";
            case 4:
                return "client_queued";
            case 5:
                return "client_waiting_to_encrypt";
            case 6:
                return "client_ready_to_send";
            case 7:
                return "client_encrypt";
            case 8:
                return "client_prekeys_fetch";
            default:
                return "unknown";
        }
    }

    public void A02(int i, int i2) {
        String A012 = A01(A00(i2), i, i2, 0);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageSendPerfQplTracker/markerBlockEnd instanceKey: ");
        A0o.append(i);
        C18260x0.A0q("; block: ", A012, A0o);
        this.A01.A03(i, A012);
        AnonymousClass2WZ r3 = this.A00;
        synchronized (r3) {
            Map map = (Map) AnonymousClass001.A0i(r3.A00, i);
            if (map != null) {
                Integer valueOf = Integer.valueOf(i2);
                Integer num = (Integer) map.get(valueOf);
                if (num != null) {
                    C18280x3.A1D(valueOf, map, num.intValue() + 1);
                }
            }
        }
    }

    public void A03(int i, int i2) {
        String A012 = A01(A00(i2), i, i2, 0);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageSendPerfQplTracker/markerBlockStart instanceKey: ");
        A0o.append(i);
        C18260x0.A0q("; block: ", A012, A0o);
        this.A01.A04(i, A012);
        AnonymousClass2WZ r1 = this.A00;
        synchronized (r1) {
            r1.A00(i, i2, 0);
        }
    }

    public void A06(int i, short s) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageSendPerfQplTracker/markerEnd instanceKey: ");
        A0o.append(i);
        C18260x0.A0w("; action: ", A0o, s);
        this.A01.A07(i, s);
        AnonymousClass2WZ r2 = this.A00;
        synchronized (r2) {
            r2.A00.remove(Integer.valueOf(i));
        }
    }
}
