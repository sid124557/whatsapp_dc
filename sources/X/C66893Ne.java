package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Ne  reason: invalid class name and case insensitive filesystem */
public class C66893Ne implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r9, C624134x r10) {
        AnonymousClass23I r0;
        if (r10 instanceof AnonymousClass1nO) {
            AnonymousClass1nO r102 = (AnonymousClass1nO) r10;
            AnonymousClass1A4 r4 = r9.A00;
            C209419x A02 = AnonymousClass1A4.A02(r4);
            C21981Dx r02 = ((AnonymousClass1EM) A02.A00).historySyncNotification_;
            if (r02 == null) {
                r02 = C21981Dx.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            long j = r102.A05;
            C21981Dx r6 = (C21981Dx) C18320x8.A0C(A0H);
            r6.bitField0_ |= 2;
            r6.fileLength_ = j;
            int i = r102.A03;
            switch (i) {
                case 0:
                    r0 = AnonymousClass23I.INITIAL_BOOTSTRAP;
                    break;
                case 1:
                    r0 = AnonymousClass23I.INITIAL_STATUS_V3;
                    break;
                case 2:
                    r0 = AnonymousClass23I.RECENT;
                    break;
                case 3:
                    r0 = AnonymousClass23I.FULL;
                    break;
                case 4:
                    r0 = AnonymousClass23I.PUSH_NAME;
                    break;
                case 5:
                    r0 = AnonymousClass23I.NON_BLOCKING_DATA;
                    break;
                case 6:
                    r0 = AnonymousClass23I.ON_DEMAND;
                    break;
                default:
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Unexpected type (");
                    A0o.append(i);
                    throw AnonymousClass000.A0F(")", A0o);
            }
            C21981Dx r1 = (C21981Dx) C18320x8.A0C(A0H);
            r1.syncType_ = r0.value;
            r1.bitField0_ |= 32;
            int i2 = r102.A00;
            if (i2 > 0) {
                C21981Dx r12 = (C21981Dx) C18320x8.A0C(A0H);
                r12.bitField0_ |= 64;
                r12.chunkOrder_ = i2;
            }
            String str = r102.A0B;
            if (str != null) {
                C21981Dx r13 = (C21981Dx) C18320x8.A0C(A0H);
                r13.bitField0_ |= 16;
                r13.directPath_ = str;
            }
            String str2 = r102.A0D;
            if (str2 != null) {
                C172548Lq A08 = C18270x1.A08(A0H, str2);
                C21981Dx r14 = (C21981Dx) A0H.A00;
                r14.bitField0_ |= 1;
                r14.fileSha256_ = A08;
            }
            String str3 = r102.A0C;
            if (str3 != null) {
                C172548Lq A082 = C18270x1.A08(A0H, str3);
                C21981Dx r15 = (C21981Dx) A0H.A00;
                r15.bitField0_ |= 8;
                r15.fileEncSha256_ = A082;
            }
            byte[] bArr = r102.A0J;
            if (bArr != null) {
                C172548Lq A0H2 = C18280x3.A0H(A0H, bArr);
                C21981Dx r16 = (C21981Dx) A0H.A00;
                r16.bitField0_ |= 4;
                r16.mediaKey_ = A0H2;
            }
            if (!TextUtils.isEmpty(r102.A0E)) {
                String str4 = r102.A0E;
                C21981Dx r17 = (C21981Dx) C18320x8.A0C(A0H);
                str4.getClass();
                r17.bitField0_ |= 128;
                r17.originalMessageId_ = str4;
            }
            int i3 = r102.A03;
            if (i3 == 2 || i3 == 3) {
                int i4 = r102.A01;
                C21981Dx r18 = (C21981Dx) C18320x8.A0C(A0H);
                r18.bitField0_ |= 256;
                r18.progress_ = i4;
            }
            long j2 = r102.A0A;
            if (j2 > 0) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
                C21981Dx r62 = (C21981Dx) C18320x8.A0C(A0H);
                r62.bitField0_ |= 512;
                r62.oldestMsgInChunkTimestampSec_ = seconds;
            }
            byte[] bArr2 = r102.A0I;
            if (bArr2 != null) {
                C172548Lq A09 = C18270x1.A09(A0H, bArr2);
                C21981Dx r19 = (C21981Dx) A0H.A00;
                r19.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                r19.initialHistBootstrapInlinePayload_ = A09;
            }
            String str5 = r102.A0F;
            if (str5 != null) {
                C21981Dx r110 = (C21981Dx) C18320x8.A0C(A0H);
                r110.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r110.peerDataRequestSessionId_ = str5;
            }
            A02.A09(AnonymousClass23O.HISTORY_SYNC_NOTIFICATION);
            AnonymousClass1EM A0W = C18310x6.A0W(A02);
            C21981Dx r03 = (C21981Dx) A0H.A06();
            r03.getClass();
            A0W.historySyncNotification_ = r03;
            A0W.bitField0_ |= 16;
            r4.A0D(A02);
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        throw AnonymousClass001.A0c(AnonymousClass000.A0R(C18310x6.A0c(r10, "Message type is not supported ", A0o2), A0o2));
    }

    public C624134x BgW(C55962rC r11) {
        int i;
        if (C385428c.A00(r11) != AnonymousClass23O.HISTORY_SYNC_NOTIFICATION) {
            return null;
        }
        AnonymousClass2z0 r2 = r11.A0D;
        AnonymousClass1nO r3 = new AnonymousClass1nO(r2, r11.A05);
        C21981Dx r4 = C55962rC.A00(r11).historySyncNotification_;
        if (r4 == null) {
            r4 = C21981Dx.DEFAULT_INSTANCE;
        }
        int i2 = r4.bitField0_;
        boolean A1S = AnonymousClass000.A1S(i2 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        Integer A0X = C18320x8.A0X();
        if (A1S) {
            r3.A0I = r4.initialHistBootstrapInlinePayload_.A07();
        } else if ((i2 & 4) != 0) {
            r3.A0J = r4.mediaKey_.A07();
            int i3 = r4.bitField0_;
            if ((i3 & 2) != 0) {
                long j = r4.fileLength_;
                if (j > 0) {
                    r3.A05 = j;
                    if ((i3 & 16) != 0) {
                        r3.A0B = r4.directPath_;
                        if ((i3 & 8) == 0 || (i3 & 1) == 0) {
                            C18260x0.A1S(AnonymousClass001.A0o(), "FMessageHistorySyncNotification/ message with missing file hash info message.key=", r2);
                            throw new AnonymousClass24W(A0X);
                        }
                        byte[] A07 = r4.fileSha256_.A07();
                        byte[] A072 = r4.fileEncSha256_.A07();
                        if (A07.length == 32 && A072.length == 32) {
                            r3.A0D = Base64.encodeToString(A07, 2);
                            r3.A0C = Base64.encodeToString(A072, 2);
                        } else {
                            C18260x0.A1S(AnonymousClass001.A0o(), "FMessageHistorySyncNotification/ message with invalid sha-256 hash message.key=", r2);
                            throw AnonymousClass24W.A00(14);
                        }
                    } else {
                        C18260x0.A1S(AnonymousClass001.A0o(), "FMessageHistorySyncNotification/ message with missing direct path message.key=", r2);
                        throw new AnonymousClass24W(A0X);
                    }
                }
            }
            C18260x0.A1S(AnonymousClass001.A0o(), "FMessageHistorySyncNotification/ message with invalid file length message.key=", r2);
            throw AnonymousClass24W.A00(13);
        } else {
            C18260x0.A1S(AnonymousClass001.A0o(), "FMessageHistorySyncNotification/ message with invalid media key message.key=", r2);
            throw AnonymousClass24W.A00(16);
        }
        int i4 = r4.bitField0_;
        if ((i4 & 32) != 0) {
            AnonymousClass23I A00 = AnonymousClass23I.A00(r4.syncType_);
            if (A00 == null) {
                A00 = AnonymousClass23I.INITIAL_BOOTSTRAP;
            }
            switch (A00.ordinal()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                default:
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Unexpected type (");
                    A0o.append(A00);
                    throw AnonymousClass000.A0F(")", A0o);
            }
            r3.A03 = i;
            if ((i4 & 64) != 0) {
                r3.A00 = r4.chunkOrder_;
            }
            if ((i4 & 128) != 0) {
                r3.A0E = r4.originalMessageId_;
            } else {
                C18260x0.A1S(AnonymousClass001.A0o(), "FMessageHistorySyncNotification/ message without original msg idmessage.key=", r2);
            }
            int i5 = r4.bitField0_;
            if ((i5 & 256) != 0) {
                r3.A01 = r4.progress_;
            }
            if ((i5 & 512) != 0) {
                r3.A0A = TimeUnit.SECONDS.toMillis(r4.oldestMsgInChunkTimestampSec_);
            }
            if ((r4.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                r3.A0F = r4.peerDataRequestSessionId_;
            }
            return r3;
        }
        C18260x0.A1S(AnonymousClass001.A0o(), "FMessageHistorySyncNotification/ message without sync typemessage.key=", r2);
        throw new AnonymousClass24W(A0X);
    }
}
