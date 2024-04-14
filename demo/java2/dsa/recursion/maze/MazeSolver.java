package demo.java2.dsa.recursion.maze;

import java.util.ArrayList;

public class MazeSolver {
    public static void main(String[] args) {
        char[][] maze = getMaze();
        boolean[][] seen = getSeen();

        ArrayList<Point> path = MazeSolver.solve(maze, new Point(1, 6), seen);
        MazeSolver.printSolvedMaze(maze, path);
    }

    public static ArrayList<Point> solve(char[][] maze, Point start, boolean[][] seen) {
        ArrayList<Point> path = new ArrayList<>();
        walk(maze, start, seen, path);
        return path;
    }

    public static boolean walk(char[][] maze, Point current, boolean[][] seen, ArrayList<Point> path) {
        // Base Cases
        // 1. Außerhalb vom Labyrinth
        if (current.x < 0
                || current.x >= maze[0].length
                || current.y < 0
                || current.y >= maze.length) {
            return false;
        }

        // 2. Wand
        if (maze[current.y][current.x] == '#') {
            return false;
        }

        // 3. Ende
        if (maze[current.y][current.x] == 'E') {
            path.add(current);
            return true;
        }

        // 4. Schon mal gesehen
        if (seen[current.y][current.x] == true) {
            return false;
        }

        // Recurse
        // Pre
        path.add(current);
        seen[current.y][current.x] = true;

        // Recurse
        for (Point direction : current.getDirections()) {
            boolean walkSuccessful = walk(maze, direction, seen, path);
            if (walkSuccessful) {
                return true;
            }
        }

        // Post
        path.remove(path.size() - 1);
        return false;
    }

    private static char[][] getMaze() {
        char[][] maze = {
                new char[] { '#', '#', '#', '#', '#', '#', '#' },
                new char[] { ' ', ' ', ' ', ' ', '#', ' ', 'E' },
                new char[] { ' ', '#', '#', ' ', ' ', ' ', '#' },
                new char[] { ' ', ' ', ' ', '#', '#', '#', '#' },
                new char[] { '#', '#', ' ', '#', '#', '#', '#' },
                new char[] { '#', ' ', '#', '#', '#', '#', '#' },
                new char[] { '#', 'S', '#', '#', '#', '#', '#' } };
        return maze;
    }

    private static boolean[][] getSeen() {
        boolean[][] seen = {
                new boolean[7],
                new boolean[7],
                new boolean[7],
                new boolean[7],
                new boolean[7],
                new boolean[7],
                new boolean[7] };
        return seen;
    }

    private static void printSolvedMaze(char[][] maze, ArrayList<Point> path) {
        if (path.size() == 0) {
            System.out.println("No Path found.");
        } else {
            for (Point point : path) {
                maze[point.y][point.x] = '+';
            }
            for (char[] row : maze) {
                for (char column : row) {
                    System.out.print(column);
                }
            }
        }
    }
}
