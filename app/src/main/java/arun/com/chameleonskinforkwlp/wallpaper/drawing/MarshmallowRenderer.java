/*
 * Copyright 2017 Arunkumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package arun.com.chameleonskinforkwlp.wallpaper.drawing;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.support.annotation.NonNull;

import java.util.HashMap;

import arun.com.chameleonskinforkwlp.wallpaper.ChameleonWallpaperService;

public class MarshmallowRenderer implements Renderer {
    private Paint paint;

    private void revertShadow() {
        paint.setShadowLayer(8.0f, 1.0f, 2.0f, 0x85000000);
    }

    @Override
    public void draw(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull HashMap<String, Integer> colorMap) {
        final int width = canvas.getWidth();
        final int height = canvas.getHeight();
        this.paint = paint;
        // divide into blocks
        int block = height / 40;

        int muted = colorMap.get(ChameleonWallpaperService.MUTED);
        int darkMuted = colorMap.get(ChameleonWallpaperService.DARK_MUTED);
        int vibrant = colorMap.get(ChameleonWallpaperService.VIBRANT);
        int darkVibrant = colorMap.get(ChameleonWallpaperService.DARK_VIBRANT);
        int lightMuted = colorMap.get(ChameleonWallpaperService.LIGHT_MUTED);

        Point point1;
        Point point2;
        Point point3;
        Point point4;
        Point point5;
        Point point6;

        // The path we draw on
        Path path;

        // set the background color.
        canvas.drawColor(darkMuted);

        paint.setColor(muted);
        point1 = new Point(0, 14 * block);
        point2 = new Point(9 * block, 23 * block);
        point3 = new Point(width, 9 * block);
        point4 = new Point(width, 0);
        point5 = new Point(0, 0);
        // Paths
        path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point1.x, point1.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.lineTo(point4.x, point4.y);
        path.lineTo(point5.x, point5.y);
        path.lineTo(point1.x, point1.y);
        path.close();
        canvas.drawPath(path, paint);
        // triangle two

        // draw quadrilateral root bg
        revertShadow();
        paint.setColor(vibrant);
        point1 = new Point(0, 18 * block);
        point2 = new Point(9 * block, 27 * block);
        point3 = new Point(width, 13 * block);
        point4 = new Point(width, 9 * block);
        point5 = new Point(9 * block, 23 * block);
        point6 = new Point(0, 14 * block);
        // Paths

        paint.setShadowLayer(20.0f, 1.0f, 2.0f, 0x85000000);
        path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point1.x, point1.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.lineTo(point4.x, point4.y);
        path.lineTo(point5.x, point5.y);
        path.lineTo(point6.x, point6.y);
        path.lineTo(point1.x, point1.y);
        path.close();
        canvas.drawPath(path, paint);
        revertShadow();
        // quadrilateral end

        paint.setColor(muted);
        point1 = new Point(0, 11 * block);
        point2 = new Point(12 * block, 0);
        point3 = new Point(0, 0);
        // Paths
        path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point1.x, point1.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.lineTo(point1.x, point1.y);
        path.close();
        canvas.drawPath(path, paint);


        paint.setShadowLayer(20.0f, 1.0f, 2.0f, 0x85000000);
        paint.setColor(lightMuted);
        point1 = new Point(0, 7 * block);
        point2 = new Point(8 * block, 0);
        point3 = new Point(0, 0);
        // Paths
        path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point1.x, point1.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.lineTo(point1.x, point1.y);
        path.close();
        canvas.drawPath(path, paint);
        revertShadow();


        paint.setShadowLayer(20.0f, 1.0f, 2.0f, 0x85000000);
        paint.setColor(darkVibrant);
        point1 = new Point(0, 35 * block);
        point2 = new Point((5 * block), 30 * block);
        point3 = new Point((5 * block), 19 * block);
        // Paths
        path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point1.x, point1.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.lineTo(width, 2 * block);
        path.lineTo(width, 0);
        path.lineTo(12 * block, 0);
        path.lineTo(0, 11 * block);
        path.lineTo(point1.x, point1.y);
        path.close();
        canvas.drawPath(path, paint);
        revertShadow();

        paint.setShadowLayer(20.0f, 1.0f, 2.0f, 0x85000000);
        paint.setColor(lightMuted);
        point1 = new Point(width, 39 * block);
        point2 = new Point(width, 25 * block);
        point3 = new Point(16 * block, 32 * block);
        // Paths
        path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point1.x, point1.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.lineTo(point1.x, point1.y);
        path.close();
        canvas.drawPath(path, paint);
    }
}
