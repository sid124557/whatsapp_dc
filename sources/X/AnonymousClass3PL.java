package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;

/* renamed from: X.3PL  reason: invalid class name */
public final class AnonymousClass3PL implements AnonymousClass4D2 {
    public final C58902w0 A00;
    public final AnonymousClass32U A01;

    public final void A01(AnonymousClass1ES r5, C624134x r6) {
        if ((r5.bitField1_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            C21331Bk r1 = r5.commentMetadata_;
            if (r1 == null) {
                r1 = C21331Bk.DEFAULT_INSTANCE;
            }
            if (AnonymousClass0x2.A1X(r1.bitField0_)) {
                AnonymousClass1ET r0 = r1.commentParentKey_;
                if (r0 == null) {
                    r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
                }
                C162457s7.A0D(r0);
                C30211m5.A00(r6, new C52042kn((C95814uZ) null, AnonymousClass32U.A01(r0)), -1);
                r6.A1B(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
                return;
            }
            int i = r1.replyCount_;
            if (i > 0) {
                r6.A1N(new C30221m6((Long) null, (Long) null, i));
            }
        }
    }

    public AnonymousClass3PL(C58902w0 r1, AnonymousClass32U r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(AnonymousClass1A3 r6, C624134x r7) {
        String str;
        if (C624134x.A0g(r7)) {
            C55162pu A0t = r7.A0t();
            if (A0t == null) {
                str = "CommentHistorySyncPostProcessor/isValidComment/comment message does not have comment info loaded";
            } else if (A0t.A02() == null) {
                str = "CommentHistorySyncPostProcessor/isValidComment/comment message does not have parent key loaded";
            } else if (C58902w0.A00(r7)) {
                if (r7.A0t() == null || r7.A0t().A02() == null) {
                    throw AnonymousClass001.A0c("CommentProtobufHelper/addCommentMetadataToWmi/comment message does not have commentInfo fully populated");
                }
                C52042kn A02 = r7.A0t().A02();
                AnonymousClass2z0 r4 = A02.A01;
                if (C627336j.A07(r4.A00) != null) {
                    C21331Bk r0 = ((AnonymousClass1ES) r6.A00).commentMetadata_;
                    if (r0 == null) {
                        r0 = C21331Bk.DEFAULT_INSTANCE;
                    }
                    C130546c9 A0H = r0.A0H();
                    AnonymousClass1A1 A0Q = C18320x8.A0Q();
                    C33051sM.A02(A02.A00, A0Q, r4, false);
                    C21331Bk r1 = (C21331Bk) C18320x8.A0C(A0H);
                    AnonymousClass1ET r02 = (AnonymousClass1ET) A0Q.A06();
                    r02.getClass();
                    r1.commentParentKey_ = r02;
                    r1.bitField0_ |= 1;
                    AnonymousClass1ES A0X = C18310x6.A0X(r6);
                    C21331Bk r03 = (C21331Bk) A0H.A06();
                    r03.getClass();
                    A0X.commentMetadata_ = r03;
                    A0X.bitField1_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                } else {
                    throw AnonymousClass001.A0c("CommentProtobufHelper/addCommentMetadataToWmi/missing parent chat jid");
                }
            }
            Log.e(str);
            throw AnonymousClass001.A0c("CommentHistorySyncPostProcessor/maybeAddCommentMetadata/Invalid comment message");
        }
        if (r7.A1r(16)) {
            C55162pu A0t2 = r7.A0t();
            if (A0t2 != null) {
                C21331Bk r04 = ((AnonymousClass1ES) r6.A00).commentMetadata_;
                if (r04 == null) {
                    r04 = C21331Bk.DEFAULT_INSTANCE;
                }
                C130546c9 A0H2 = r04.A0H();
                int A012 = A0t2.A01();
                C21331Bk r12 = (C21331Bk) C18320x8.A0C(A0H2);
                r12.bitField0_ |= 2;
                r12.replyCount_ = A012;
                AnonymousClass1ES A0X2 = C18310x6.A0X(r6);
                C21331Bk r05 = (C21331Bk) A0H2.A06();
                r05.getClass();
                A0X2.commentMetadata_ = r05;
                A0X2.bitField1_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                return;
            }
            throw AnonymousClass001.A0c("CommentProtobufHelper/addCommentParentMetadataToWmi/comment parent message does not have commentInfo fully populated");
        }
    }

    public void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
        C18260x0.A0O(r3, r2);
        A00(r2, r3);
    }

    public void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
        C18260x0.A0O(r2, r3);
        A01(r2, r3);
    }
}
