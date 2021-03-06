/*
 * Copyright 2011 <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
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
package org.ocpsoft.urlbuilder.util;


/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public class CapturingGroup
{
   private final CharSequence chars;
   private final int start;
   private final int end;

   public CapturingGroup(final CharSequence path, final int start, final int end)
   {
      this.chars = path;
      this.start = start;
      this.end = end;
   }

   public int getStart()
   {
      return start;
   }

   public int getEnd()
   {
      return end;
   }

   public CharSequence getCaptured()
   {
      return chars.subSequence(start + 1, end);
   }

   @Override
   public String toString()
   {
      return "CapturingGroup [start=" + start + ", end=" + end + "]";
   }
}
