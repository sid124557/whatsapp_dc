package androidx.media;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = 0;

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.A00);
        AnonymousClass000.A1M(objArr, this.A01);
        AnonymousClass000.A1N(objArr, this.A03);
        AnonymousClass000.A1O(objArr, this.A02);
        return Arrays.hashCode(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if ((r3 & 4) == 4) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r2 == 7) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.media.AudioAttributesImplBase
            r5 = 0
            if (r0 == 0) goto L_0x002d
            androidx.media.AudioAttributesImplBase r7 = (androidx.media.AudioAttributesImplBase) r7
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 != r0) goto L_0x002d
            int r4 = r6.A01
            int r3 = r7.A01
            int r2 = r7.A02
            r0 = -1
            if (r2 == r0) goto L_0x002e
            r0 = 6
            if (r2 == r0) goto L_0x0038
            r0 = 7
            if (r2 != r0) goto L_0x001e
        L_0x001c:
            r3 = r3 | 1
        L_0x001e:
            r0 = r3 & 273(0x111, float:3.83E-43)
            if (r4 != r0) goto L_0x002d
            int r1 = r6.A03
            int r0 = r7.A03
            if (r1 != r0) goto L_0x002d
            int r0 = r6.A02
            if (r0 != r2) goto L_0x002d
            r5 = 1
        L_0x002d:
            return r5
        L_0x002e:
            r1 = r3 & 1
            r0 = 1
            if (r1 == r0) goto L_0x001c
            r1 = 4
            r0 = r3 & 4
            if (r0 != r1) goto L_0x001e
        L_0x0038:
            r3 = r3 | 4
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesImplBase.equals(java.lang.Object):boolean");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        int i = this.A02;
        if (i != -1) {
            sb.append(" stream=");
            sb.append(i);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i2 = this.A03;
        switch (i2) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = AnonymousClass000.A0Y("unknown usage ", AnonymousClass001.A0o(), i2);
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.A00);
        sb.append(" flags=0x");
        return AnonymousClass000.A0X(Integer.toHexString(this.A01).toUpperCase(), sb);
    }
}
