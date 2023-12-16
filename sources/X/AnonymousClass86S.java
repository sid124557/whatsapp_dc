package X;

import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.86S  reason: invalid class name */
public final class AnonymousClass86S implements C185328tT {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = -1;
    public C187648xa A04;
    public C187028wK A05;
    public C1686186c A06;
    public C1687686r A07;
    public C1688887d A08;
    public final C161467pi A09 = C161467pi.A05(6);

    public void BFs(C187028wK r1) {
        this.A05 = r1;
    }

    public int BiD(C187648xa r32, AnonymousClass7BG r33) {
        int i;
        String A0L;
        long j;
        String str;
        String str2;
        long j2;
        long j3;
        int i2 = this.A02;
        C187648xa r6 = r32;
        if (i2 == 0) {
            C161467pi r4 = this.A09;
            r4.A0Q(2);
            r6.readFully(r4.A02, 0, 2);
            int A0F = r4.A0F();
            this.A00 = A0F;
            if (A0F == 65498) {
                if (this.A03 != -1) {
                    i = 4;
                }
                C187028wK r42 = this.A05;
                r42.getClass();
                C185598tw Br0 = r42.Br0(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 4);
                C157057he A002 = C157057he.A00();
                A002.A0J = new C166547ys(new C187368x6[0]);
                C166527yp.A01(A002, Br0);
                C187028wK r2 = this.A05;
                r2.getClass();
                r2.B2W();
                C1686986k.A01(this.A05, -9223372036854775807L);
                i = 6;
            } else {
                if (A0F < 65488 ? A0F != 65281 : A0F > 65497) {
                    i = 1;
                }
                return 0;
            }
        } else if (i2 == 1) {
            C161467pi r43 = this.A09;
            r43.A0Q(2);
            r6.readFully(r43.A02, 0, 2);
            this.A01 = r43.A0F() - 2;
            this.A02 = 2;
            return 0;
        } else if (i2 != 2) {
            AnonymousClass7BG r9 = r33;
            if (i2 == 4) {
                long BBW = r6.BBW();
                long j4 = this.A03;
                if (BBW != j4) {
                    r9.A00 = j4;
                    return 1;
                }
                if (r6.Bge(this.A09.A02, 0, 1, true)) {
                    r6.Bjy();
                    if (this.A07 == null) {
                        this.A07 = new C1687686r(0);
                    }
                    C1686186c r22 = new C1686186c(r6, this.A03);
                    this.A06 = r22;
                    if (C154817dn.A00(r22, false)) {
                        C1687686r r7 = this.A07;
                        long j5 = this.A03;
                        C187028wK r62 = this.A05;
                        r62.getClass();
                        r7.A0B = new C1686486f(r62, j5);
                        C1688887d r23 = this.A08;
                        r23.getClass();
                        C187028wK r44 = this.A05;
                        r44.getClass();
                        C185598tw Br02 = r44.Br0(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 4);
                        C157057he A003 = C157057he.A00();
                        A003.A0J = new C166547ys(r23);
                        C166527yp.A01(A003, Br02);
                        i = 5;
                    }
                }
                C187028wK r422 = this.A05;
                r422.getClass();
                C185598tw Br03 = r422.Br0(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 4);
                C157057he A0022 = C157057he.A00();
                A0022.A0J = new C166547ys(new C187368x6[0]);
                C166527yp.A01(A0022, Br03);
                C187028wK r24 = this.A05;
                r24.getClass();
                r24.B2W();
                C1686986k.A01(this.A05, -9223372036854775807L);
                i = 6;
            } else if (i2 == 5) {
                if (this.A06 == null || r6 != this.A04) {
                    this.A04 = r6;
                    this.A06 = new C1686186c(r6, this.A03);
                }
                C1687686r r25 = this.A07;
                r25.getClass();
                int BiD = r25.BiD(this.A06, r9);
                if (BiD != 1) {
                    return BiD;
                }
                r9.A00 += this.A03;
                return BiD;
            } else if (i2 == 6) {
                return -1;
            } else {
                throw AnonymousClass6CA.A0O();
            }
        } else {
            if (this.A00 == 65505) {
                int i3 = this.A01;
                C161467pi A052 = C161467pi.A05(i3);
                r6.readFully(A052.A02, 0, i3);
                if (this.A08 == null && "http://ns.adobe.com/xap/1.0/".equals(A052.A0L()) && (A0L = A052.A0L()) != null) {
                    long length = r6.getLength();
                    C1688887d r72 = null;
                    if (length != -1) {
                        try {
                            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            newPullParser.setInput(new StringReader(A0L));
                            newPullParser.next();
                            if (C159317ld.A01("x:xmpmeta", newPullParser)) {
                                C129586aY of = C129586aY.of();
                                long j6 = -9223372036854775807L;
                                loop0:
                                while (true) {
                                    newPullParser.next();
                                    if (C159317ld.A01("rdf:Description", newPullParser)) {
                                        String[] strArr = AnonymousClass792.A02;
                                        int length2 = strArr.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length2) {
                                                break loop0;
                                            }
                                            String A004 = C159317ld.A00(strArr[i4], newPullParser);
                                            if (A004 != null) {
                                                if (Integer.parseInt(A004) != 1) {
                                                    break;
                                                }
                                                String[] strArr2 = AnonymousClass792.A01;
                                                int length3 = strArr2.length;
                                                int i5 = 0;
                                                while (true) {
                                                    j6 = -9223372036854775807L;
                                                    if (i5 >= length3) {
                                                        break;
                                                    }
                                                    String A005 = C159317ld.A00(strArr2[i5], newPullParser);
                                                    if (A005 != null) {
                                                        long parseLong = Long.parseLong(A005);
                                                        if (parseLong != -1) {
                                                            j6 = parseLong;
                                                        }
                                                    } else {
                                                        i5++;
                                                    }
                                                }
                                                String[] strArr3 = AnonymousClass792.A00;
                                                int length4 = strArr3.length;
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 >= length4) {
                                                        break;
                                                    }
                                                    String A006 = C159317ld.A00(strArr3[i6], newPullParser);
                                                    if (A006 != null) {
                                                        of = C129586aY.of(new AnonymousClass7JY(0, "image/jpeg", 0), new AnonymousClass7JY(Long.parseLong(A006), "video/mp4", 0));
                                                        break;
                                                    }
                                                    i6++;
                                                }
                                            } else {
                                                i4++;
                                            }
                                        }
                                    } else {
                                        if (C159317ld.A01("Container:Directory", newPullParser)) {
                                            str = "Container";
                                            str2 = "Item";
                                        } else if (C159317ld.A01("GContainer:Directory", newPullParser)) {
                                            str = "GContainer";
                                            str2 = "GContainerItem";
                                        }
                                        C129486aO builder = C129586aY.builder();
                                        String A0X = AnonymousClass000.A0X(":Item", AnonymousClass000.A0l(str));
                                        String A0X2 = AnonymousClass000.A0X(":Directory", AnonymousClass000.A0l(str));
                                        while (true) {
                                            newPullParser.next();
                                            if (C159317ld.A01(A0X, newPullParser)) {
                                                String A0X3 = AnonymousClass000.A0X(":Mime", AnonymousClass000.A0l(str2));
                                                String A0X4 = AnonymousClass000.A0X(":Semantic", AnonymousClass000.A0l(str2));
                                                String A0X5 = AnonymousClass000.A0X(":Length", AnonymousClass000.A0l(str2));
                                                String A0X6 = AnonymousClass000.A0X(":Padding", AnonymousClass000.A0l(str2));
                                                String A007 = C159317ld.A00(A0X3, newPullParser);
                                                String A008 = C159317ld.A00(A0X4, newPullParser);
                                                String A009 = C159317ld.A00(A0X5, newPullParser);
                                                String A0010 = C159317ld.A00(A0X6, newPullParser);
                                                if (A007 == null || A008 == null) {
                                                    break;
                                                }
                                                if (A009 != null) {
                                                    j2 = Long.parseLong(A009);
                                                } else {
                                                    j2 = 0;
                                                }
                                                if (A0010 != null) {
                                                    j3 = Long.parseLong(A0010);
                                                } else {
                                                    j3 = 0;
                                                }
                                                builder.add((Object) new AnonymousClass7JY(j2, A007, j3));
                                            }
                                            if (newPullParser.getEventType() == 3 && AnonymousClass6C8.A1T(A0X2, newPullParser)) {
                                                of = builder.build();
                                                break;
                                            }
                                        }
                                        of = C129586aY.of();
                                    }
                                    if (newPullParser.getEventType() == 3 && AnonymousClass6C8.A1T("x:xmpmeta", newPullParser)) {
                                        if (!of.isEmpty()) {
                                            C147837Fx r45 = new C147837Fx(of, j6);
                                            List list = r45.A01;
                                            if (list.size() >= 2) {
                                                int A032 = AnonymousClass002.A03(list);
                                                long j7 = -1;
                                                long j8 = -1;
                                                long j9 = -1;
                                                long j10 = -1;
                                                boolean z = false;
                                                while (true) {
                                                    if (A032 < 0) {
                                                        break;
                                                    }
                                                    AnonymousClass7JY r63 = (AnonymousClass7JY) list.get(A032);
                                                    boolean equals = "video/mp4".equals(r63.A02) | z;
                                                    if (A032 == 0) {
                                                        length -= r63.A01;
                                                        j = 0;
                                                    } else {
                                                        j = length - r63.A00;
                                                    }
                                                    long j11 = length;
                                                    length = j;
                                                    if (!equals || j == j11) {
                                                        z = equals;
                                                    } else {
                                                        j10 = j11 - j;
                                                        j9 = j;
                                                        z = false;
                                                    }
                                                    if (A032 == 0) {
                                                        j7 = j;
                                                        j8 = j11;
                                                        break;
                                                    }
                                                    A032--;
                                                }
                                                if (j9 != -1 && j10 != -1 && j7 != -1 && j8 != -1) {
                                                    r72 = new C1688887d(j7, j8, r45.A00, j9, j10);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw AnonymousClass6u7.A01("Couldn't find xmp metadata");
                            }
                        } catch (AnonymousClass6u7 | NumberFormatException | XmlPullParserException unused) {
                            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        }
                    }
                    this.A08 = r72;
                    if (r72 != null) {
                        this.A03 = r72.A04;
                    }
                }
            } else {
                r6.BpP(this.A01);
            }
            this.A02 = 0;
            return 0;
        }
        this.A02 = i;
        return 0;
    }

    public void Bkz(long j, long j2) {
        if (j == 0) {
            this.A02 = 0;
            this.A07 = null;
        } else if (this.A02 == 5) {
            C1687686r r0 = this.A07;
            r0.getClass();
            r0.Bkz(j, j2);
        }
    }

    public boolean BpS(C187648xa r8) {
        C161467pi r6 = this.A09;
        r6.A0Q(2);
        r8.Bgd(r6.A02, 0, 2);
        if (r6.A0F() != 65496) {
            return false;
        }
        r6.A0Q(2);
        C161467pi.A06(r8, r6, 2);
        int A0F = r6.A0F();
        this.A00 = A0F;
        if (A0F == 65504) {
            r6.A0Q(2);
            C161467pi.A06(r8, r6, 2);
            r8.Awu(r6.A0F() - 2);
            r6.A0Q(2);
            C161467pi.A06(r8, r6, 2);
            A0F = r6.A0F();
            this.A00 = A0F;
        }
        if (A0F != 65505) {
            return false;
        }
        r8.Awu(2);
        r6.A0Q(6);
        C161467pi.A06(r8, r6, 6);
        if (r6.A0I() == 1165519206 && r6.A0F() == 0) {
            return true;
        }
        return false;
    }
}
